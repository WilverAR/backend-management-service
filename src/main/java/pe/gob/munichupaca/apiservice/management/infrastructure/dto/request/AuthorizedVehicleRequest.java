package pe.gob.munichupaca.apiservice.management.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AuthorizedVehicleRequest {

    @NotBlank(message = "License plate is required")
    @Size(min = 6, max = 10, message = "License plate must be between 6 and 10 characters")
    private String licensePlate;

    @NotBlank(message = "Brand is required")
    @Size(min = 1, max = 25, message = "Brand must be between 1 and 25 characters")
    private String brand;

    @NotBlank(message = "Model is required")
    @Size(min = 1, max = 25, message = "Model must be between 1 and 25 characters")
    private String model;

    @NotBlank(message = "Status is required")
    @Size(min = 1, max = 50, message = "Status must be between 1 and 50 characters")
    private String status;

    @NotBlank(message = "Modality is required")
    @Size(min = 1, max = 50, message = "Modality must be between 1 and 50 characters")
    private String modality;

    @NotBlank(message = "Circulation is required")
    @Size(min = 1, max = 50, message = "Circulation must be between 1 and 50 characters")
    private String circulation;

    @NotBlank(message = "Route is required")
    @Size(min = 1, max = 50, message = "Route must be between 1 and 50 characters")
    private String route;

    @NotBlank(message = "Issue date is required")
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Issue date must be in the format DD/MM/YYYY")
    @Size(min = 10, max = 10, message = "Issue date must be 10 characters")
    private String issueDate;

    @NotBlank(message = "Expiration date is required")
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Expiration date must be in the format DD/MM/YYYY")
    @Size(min = 10, max = 10, message = "Expiration date must be 10 characters")
    private String expirationDate;

    @NotBlank(message = "Fleet number is required")
    @Size(min = 1, max = 25, message = "Fleet number must be between 1 and 25 characters")
    private String fleetNumber;

    @NotBlank(message = "Circulation card is required")
    @Size(min = 1, max = 25, message = "Circulation card must be between 1 and 25 characters")
    private String circulationCard;

    @NotBlank(message = "Owner name is required")
    @Size(min = 1, max = 50, message = "Owner name must be between 1 and 50 characters")
    private String ownerName;

    @NotBlank(message = "Document number is required")
    @Size(min = 1, max = 25, message = "Document number must be between 1 and 25 characters")
    private String documentNumber;

    @NotBlank(message = "Affiliated company is required")
    @Size(min = 1, max = 50, message = "Affiliated company must be between 1 and 50 characters")
    private String affiliatedCompany;
}