package com.example.question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class EmployeeAnalysisService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @PostConstruct
    public void runAnalysis() {
        String sql = "SELECT e1.EMP_ID, e1.FIRST_NAME, e1.LAST_NAME, d.DEPARTMENT_NAME, " +
                "(SELECT COUNT(*) FROM EMPLOYEE e2 WHERE e2.DEPARTMENT = e1.DEPARTMENT AND e2.DOB > e1.DOB) AS YOUNGER_EMPLOYEES_COUNT " +
                "FROM EMPLOYEE e1 JOIN DEPARTMENT d ON e1.DEPARTMENT = d.DEPARTMENT_ID ORDER BY e1.EMP_ID DESC";

        List<EmployeeDepartmentDTO> results = jdbcTemplate.query(sql, (rs, rowNum) -> {
            EmployeeDepartmentDTO dto = new EmployeeDepartmentDTO();
            dto.setEmpId(rs.getInt("EMP_ID"));
            dto.setFirstName(rs.getString("FIRST_NAME"));
            dto.setLastName(rs.getString("LAST_NAME"));
            dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
            dto.setYoungerEmployeesCount(rs.getInt("YOUNGER_EMPLOYEES_COUNT"));
            return dto;
        });

        // Example JWT and API URL
        String jwt = "your_jwt_token_here";
        String secondApiUrl = "https://your-second-api-url";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(jwt);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<List<EmployeeDepartmentDTO>> entity = new HttpEntity<>(results, headers);

        restTemplate.postForEntity(secondApiUrl, entity, String.class);
    }
}
