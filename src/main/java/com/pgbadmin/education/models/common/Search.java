package com.pgbadmin.education.models.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Search {
    private String value;
    private String regexp;
}
