package com.javashitang.transfer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentPO {

    private Integer id;
    private String name;
    private Integer age;
    private String className;
}
