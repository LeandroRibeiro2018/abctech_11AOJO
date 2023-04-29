package br.com.fiap.abctechapi.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.PastOrPresent;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLocationDto {

    private Double latitude;
    private Double longitude;

    @PastOrPresent
    @JsonProperty("datetime")
    private Date date;
}
