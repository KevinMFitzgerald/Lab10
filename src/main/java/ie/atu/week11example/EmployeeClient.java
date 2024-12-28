package ie.atu.week11example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="employee-service",url = "http://localhost:8083")
public interface EmployeeClient {
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable String id);
}
