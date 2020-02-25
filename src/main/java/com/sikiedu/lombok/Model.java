package com.sikiedu.lombok;

import lombok.*;

import java.util.logging.Logger;

/**
 * @author jianggang
 * @date 2019/6/28 14:28:21
 * @description
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Model {


    @NonNull
    private String name;

    private Integer age;

//    public void setName(String name) { this.name = name; }
//    public void setAge(Integer age) { this.age = age; }
//
//
//    public String getName() { return this.name; }
//
//    public Integer getAge() { return this.age; }
}
