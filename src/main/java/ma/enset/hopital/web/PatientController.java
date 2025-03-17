package ma.enset.hopital.web;

import lombok.AllArgsConstructor;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(){
        return "patients";
    }
}
