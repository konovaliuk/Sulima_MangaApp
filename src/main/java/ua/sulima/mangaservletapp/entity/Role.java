package ua.sulima.mangaservletapp.entity;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Role {

    private Integer id;

    private String name;
}
