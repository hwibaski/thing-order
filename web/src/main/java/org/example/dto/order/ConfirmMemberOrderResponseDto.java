package org.example.dto.order;

import lombok.*;

@Getter
@Setter
public class ConfirmMemberOrderResponseDto {
    private boolean ok;
    private boolean results;

    public ConfirmMemberOrderResponseDto(boolean ok, boolean results) {
        this.ok = ok;
        this.results = results;
    }
}
