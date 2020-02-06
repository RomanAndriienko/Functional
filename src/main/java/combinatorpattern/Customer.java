package combinatorpattern;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@Data
public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;
}
