package com.siture.webApplication.models;

import com.siture.webApplication.models.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "path")
    private String path;
    @Column(name = "price")
    private int price;
    @Column(name = "oldPrice")
    private int oldPrice;

    @ElementCollection
    @CollectionTable(name = "materialList", joinColumns = @JoinColumn(name = "materialListId"))
    @Column(name = "materials")
    private List<String> materials;

    @ElementCollection
    @CollectionTable(name = "furnitureList", joinColumns = @JoinColumn(name = "furnitureListId"))
    @Column(name = "furniture")
    private List<String> furniture;
}
