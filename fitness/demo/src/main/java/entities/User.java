package entities;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ActivityLog> activitieslog;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ChallengeParticipation> challenges;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FitnessGoal> goals;
}
