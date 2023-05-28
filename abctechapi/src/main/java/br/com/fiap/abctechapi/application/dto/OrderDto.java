package br.com.fiap.abctechapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class OrderDto {

    @NonNull
    public Long operatorId;

    @NotEmpty
    private List<Long> services;

    @Valid
    private OrderLocationDto start;

    @Valid
    private OrderLocationDto end;


}
