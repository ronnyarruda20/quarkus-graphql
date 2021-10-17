package org.graphql.modules.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DrogariaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
}
