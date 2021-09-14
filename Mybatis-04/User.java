package pojo;

import lombok.*;

@Data                    //无参构造  get set toString  hashCode equals
@AllArgsConstructor      //有参构造
@NoArgsConstructor       //无参构造

@ToString                //toString
@EqualsAndHashCode       //equals hashCode
@Getter                  //get
@Setter                  //set


public class User {
    private int id;
    private String name;
    private String pwd;
}
