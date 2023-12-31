package searchengine.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "index_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IndexTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "page_id", nullable = false)
    private PageTable page;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lemma_id", nullable = false)
    private LemmaTable lemma;

    @Column(name = "index_rank", nullable = false)
    private float rank;
}