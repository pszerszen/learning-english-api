package com.osa.learning.english.model.dto;

import java.net.URI;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WordDto {

    @NotNull
    private String english;
    @NotNull
    private String polish;
    private String category;
    private URI imageUri;
}
