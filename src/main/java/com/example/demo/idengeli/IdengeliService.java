package com.example.demo.idengeli;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//annotation to let us know we are at the Service Layer stage
@Service
public class IdengeliService {
    public List<Idengeli> getIdengeli(){
        return  List.of(
                new Idengeli(
                        1L,
                        "Raymond Idengeli",
                        34,
                        "Java Developer",
                        'M',
                        LocalDate.of(1990, Month.JULY, 7),
                        "ray.idengeli@gmail.com"
                )
        );
    }
}
