package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Json {
    private insured insured;
    private beneficiary beneficiary;
    private List<bonus> bonuses;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class insured{
        private boolean isRequired;
        private String title;
        private String description;
        private gender gender;
        private birthDate birthDate;


    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class gender{

        private boolean isRequired;
        private List<String> values;


    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class birthDate{
        private boolean isRequired;
        private Date minValue;

        private Date maxValue;
        private int contractEndAgeThreshold;

    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class beneficiary{
        private boolean isRequired;
        private String title;
        private String description;
    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class bonus{
        private String source;
        private String percentage;
    }

}
