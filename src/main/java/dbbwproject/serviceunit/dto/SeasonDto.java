package dbbwproject.serviceunit.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeasonDto {
    @NotBlank(message = "season code cannot be null or empty")
    @Size(max = 10, message = "season code can not exceed 10 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "season code can only contain A-Z,a-z and 0-9 letters")
    @ApiModelProperty(notes = "Code of the season (unique)", required = true, example = "s1")
    private String code;

    @NotNull(message = "season status can not be null")
    @ApiModelProperty(notes = "Status of the season(Ex:COMPLETED,CURRENT)", allowableValues = "CURRENT,COMPLETED,UP_COMING")
    private SeasonStatus status;

}
