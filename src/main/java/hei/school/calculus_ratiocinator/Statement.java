package hei.school.calculus_ratiocinator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Statement {
    private String body;
    private String status;
    public static String IsFalseOrTrue(Statement statement1, Statement statement2){
        if (statement1.getStatus().equals("TRUE") && statement2.getStatus().equals("TRUE") || (statement1.getStatus().equals("TRUE") || statement2.getStatus().equals("TRUE"))){
            return "TRUE";
        }else if((statement1.getStatus().equals("FALSE") && statement2.getStatus().equals("FALSE"))) {
            return "FALSE";
        }
        return "UNKNOWN";
    }
}
