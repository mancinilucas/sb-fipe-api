package com.acarajecorp.sbfipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Data(@JsonAlias("codigo")String carCode,
                   @JsonAlias("nome") String carName) {
}
