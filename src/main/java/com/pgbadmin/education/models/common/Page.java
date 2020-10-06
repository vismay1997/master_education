package com.pgbadmin.education.models.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Page<T> {
    private List<T> data;
    private int recordsFiltered;
    private int recordsTotal;
    private int draw;
}

