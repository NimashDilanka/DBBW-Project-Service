package dbbwproject.serviceunit.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    //region Meta Data of booking
    @NotBlank
    @Size(max = 10, message = "season code can not exceed 10 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "season code can only contain A-Z,a-z and 0-9 letters")
    @ApiModelProperty(notes = "Code of the season.", example = "s1", required = true)
    private String seasonCode;

    @NotBlank
    @Size(max = 5, message = "trip code can not exceed 5 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "trip code can only contain A-Z,a-z and 0-9 letters")
    @ApiModelProperty(notes = "Code of the trip.", example = "t12", required = true)
    private String tripCode;

    @NotBlank
    @Size(max = 100, message = "trip code can not exceed 100 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "person name can only contain A-Z,a-z letters")
    @ApiModelProperty(notes = "Name of the customer of pencil booking. Note that (seasonCode,tripCode,Name) is unique", example = "Gunasekara", required = true)
    private String pbPersonName;

    @NotBlank
    @Pattern(regexp = "^\\d{4}[/\\-](0?[1-9]|1[012])[/\\-](0?[1-9]|[12][0-9]|3[01])$"
            , message = "Trip start date / flight departure Date should be  in yyyy-MM-dd format")
    @ApiModelProperty(notes = "Trip start date / flight departure Date in yyyy-MM-dd format", example = "2019-12-21")
    private String tripStartDate;

    @Positive
    @ApiModelProperty(notes = "Registration number assigned to the paseenger in related pencil booking.", example = "10", required = true)
    private int registrationNumber;

    @ApiModelProperty(notes = "Status of the booking(Ex:INCOMPLETE)", allowableValues = "INCOMPLETE,COMPLETED")
    BookingStatus bookingStatus;
    //endregion

    //region Personal Details
    @NotBlank
    @Size(max = 44, message = "surname can not exceed 44 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "person name can only contain A-Z,a-z letters")
    @ApiModelProperty(notes = "Surname of the customer of pencil booking.", example = "Ekanayake", required = true)
    private String surName;

    @NotBlank
    @Size(max = 44, message = "OtherNames can not exceed 44 characters")
    @Pattern(regexp = "^[a-zA-Z ]*$", message = "other Names can only contain A-Z,a-z letters")
    @ApiModelProperty(notes = "Other names of the passenger.", example = "Dissanayake Mudiyanselage Sanjaya", required = true)
    private String otherNames;

    @Size(max = 44, message = "NIC Address can not exceed 44 characters")
    @ApiModelProperty(notes = "NIC Address of the passenger.", example = "D7,Factory Side,Hingurana", required = true)
    private String nicAddress;

    @Size(max = 44, message = "Permanent Address can not exceed 44 characters")
    @ApiModelProperty(notes = "Permanent Address of the passenger.", example = "14/7/56,Mount Lavinia", required = true)
    private String permanentAddress;

    @NotBlank
    @Size(max = 12, message = "District can not exceed 44 characters")
    @ApiModelProperty(notes = "District of the passenger.", example = "Meegahapura", required = true)
    private String district;

    @Email(message = "Email address is not valid")
    @Size(max = 22, message = "Email Address can not exceed 22 characters")
    @ApiModelProperty(notes = "Email Address of the passenger.", example = "nimash123@gmail.com")
    private String emailAddress;

    @NotBlank
    @Size(max = 10, message = "Telephone number for passport application can not exceed 10 characters")
    @ApiModelProperty(notes = "Telephone number for passport application filling.", example = "0718469552", required = true)
    private String tpNoForPp;

    @Size(max = 10, message = "Telephone number one for personal contacts can not exceed 10 characters")
    @ApiModelProperty(notes = "Telephone number one for personal contacts.", example = "0718469552", required = true)
    private String tpNoForContacts1;

    @Size(max = 10, message = "Telephone number two for personal contacts can not exceed 10 characters")
    @ApiModelProperty(notes = "Telephone number two for personal contacts.", example = "0718469552")
    private String tpNoForContacts2;

    @Pattern(regexp = "^\\d{4}[/\\-](0?[1-9]|1[012])[/\\-](0?[1-9]|[12][0-9]|3[01])$"
            , message = "Date of birth should be  in yyyy-MM-dd format")
    @ApiModelProperty(notes = "Date of birth of passenger in yyyy-MM-dd format", example = "1998-12-21", required = true)
    private String dateOfBirth;

    @Size(max = 4, message = "birthCertificate No can not exceed 4 characters")
    @ApiModelProperty(notes = "birthCertificate No of the passenger", example = "0645")
    private String birthCertificateNo;

    @Size(max = 12, message = "birthCertificate District can not exceed 12 characters")
    @ApiModelProperty(notes = "birth Certificate District of the passenger", example = "Uyandana")
    private String birthCertificateDistrict;

    @Size(max = 22, message = "Place of birth can not exceed 22 characters")
    @ApiModelProperty(notes = "Place of birth of passenger.", example = "Maharagama", required = true)
    private String placeOfBirth;

    @Size(max = 12, message = "NIC no can not exceed 12 characters")
    @ApiModelProperty(notes = "NIC no of passenger.", example = "952365478v", required = true)
    private String nicNo;

    @ApiModelProperty(notes = "Gender of passenger.", example = "MALE", required = true, allowableValues = "MALE,FEMALE")
    private Gender gender;

    @Size(max = 22, message = "job can not exceed 22 characters")
    @ApiModelProperty(notes = "job of passenger.", example = "Software Engineer")
    private String job;

    @ApiModelProperty(notes = "whether passenger is married or not.", example = "false")
    private boolean married;

    @Size(max = 22, message = "spouse name can not exceed 22 characters")
    @ApiModelProperty(notes = "spouse name, wife or husband.", example = "P G Kanthi")
    private String spouseName;

    @Size(max = 22, message = "spouse birth place can not exceed 22 characters")
    @ApiModelProperty(notes = "spouse birth place.", example = "Dabha Uyana")
    private String spouseBirthPlace;

    @Size(max = 22, message = "father's name can not exceed 22 characters")
    @ApiModelProperty(notes = "sfather's name.", example = "D Piyadasa")
    private String fatherName;

    @Size(max = 22, message = "father's birth place can not exceed 22 characters")
    @ApiModelProperty(notes = "father's birth place.", example = "Dabha Uyana")
    private String fatherBirthPlace;

    @Size(max = 22, message = "mother's name can not exceed 22 characters")
    @ApiModelProperty(notes = "mother's name.", example = "P G Kanthi")
    private String motherName;

    @Size(max = 22, message = "mother's birth place can not exceed 22 characters")
    @ApiModelProperty(notes = "mother's birth place.", example = "Dabha Uyana")
    private String motherBirthPlace;

    @NotBlank
    @Size(max = 22, message = "owner's name can not exceed 22 characters")
    @ApiModelProperty(notes = "person's name who is responsible for the passenger, who can be informed about passenger's illnesses or injuries.", example = "P G Priyanthi")
    private String ownerName;

    @NotBlank
    @Size(max = 44, message = "owner's adress can not exceed 44 characters")
    @ApiModelProperty(notes = "person's address who is responsible for the passenger, who can be informed about passenger's illnesses or injuries.", example = "P G Priyanthi")
    private String ownerAddress;

    @NotBlank
    @Size(max = 10, message = "owner's telephone number1 can not exceed 10 characters")
    @ApiModelProperty(notes = "person's telephone number1 who is responsible for the passenger, who can be informed about passenger's illnesses or injuries.", example = "0718712587")
    private String ownerTpNo1;

    @NotBlank
    @Size(max = 10, message = "owner's telephone number2 can not exceed 10 characters")
    @ApiModelProperty(notes = "person's telephone number2 who is responsible for the passenger, who can be informed about passenger's illnesses or injuries.", example = "0774832569")
    private String ownerTpNo2;

    //endregion

    //region Health and Military Requirements

    @ApiModelProperty(notes = "whether passenger has diabetic", example = "true")
    private boolean diabetic;

    @ApiModelProperty(notes = "whether passenger has high blood pressure", example = "true")
    private boolean highBloodPressure;

    @ApiModelProperty(notes = "whether passenger has arthritis", example = "true")
    private boolean arthritis;

    @ApiModelProperty(notes = "whether passenger has wheezing", example = "true")
    private boolean wheezing;

    @ApiModelProperty(notes = "whether passenger has heart illness", example = "true")
    private boolean heartIllness;

    @ApiModelProperty(notes = "whether passenger has epilepsy", example = "true")
    private boolean epilepsy;

    @ApiModelProperty(notes = "whether passenger has presented a medical certificate", example = "true")
    private boolean medicalReport;

    @ApiModelProperty(notes = "whether passenger has other illness than above mentioned", example = "High anxity level")
    private boolean otherIllnessExist;

    @Size(max = 22, message = "Other illness detail can not exceed 22 characters")
    @ApiModelProperty(notes = "Illness details if passenger has other illness than above mentioned", example = "true")
    private String otherIllnessDetail;

    @ApiModelProperty(notes = "whether passenger has encounter a surgery", example = "true")
    private boolean surgery;

    @ApiModelProperty(notes = "whether passenger uses artificial hands or legs", example = "true")
    private boolean artificialHandLeg;

    @ApiModelProperty(notes = "whether passenger uses drugs for mental illness", example = "true")
    private boolean mentalIllness;

    @ApiModelProperty(notes = "whether passenger was in military services", example = "true")
    private boolean militaryPerson;

    @ApiModelProperty(notes = "whether passenger was in military services and resigned legally from it", example = "true")
    private boolean resignedFrmMilitary;

    @ApiModelProperty(notes = "whether passenger was forbidden leaving country", example = "true")
    private boolean forbiddenLeaveCountry;

    @ApiModelProperty(notes = "whether passenger was informed about military and court cases issues", example = "true")
    private boolean informCourtMilitaryIssues;

    //endregion

    //region Personal Documents
    @ApiModelProperty(notes = "whether Birth Certificate received from passenger", example = "true")
    private boolean bcReceived;

    @ApiModelProperty(notes = "whether Birth Certificate Copy received from passenger", example = "true")
    private boolean bcCopyReceived;

    @ApiModelProperty(notes = "whether NIC received from passenger", example = "true")
    private boolean nicReceived;

    @ApiModelProperty(notes = "whether old person NIC received from passenger", example = "true")
    private boolean oldNicReceived;

    @ApiModelProperty(notes = "whether certified photos received from passenger", example = "true")
    private boolean certifiedPhotoReceived;

    @ApiModelProperty(notes = "whether copy of NIC received from passenger", example = "true")
    private boolean copyOfNicReceived;

    @ApiModelProperty(notes = "whether village officer certification for person's name change received from passenger", example = "true")
    private boolean voCertfiedNameReceived;

    @ApiModelProperty(notes = "whether village officer certification for person's date of birth change received from passenger", example = "true")
    private boolean voCertfiedDobReceived;
    //endregion

    //region Passport and Dual Nationality
    @ApiModelProperty(notes = "whether passenger need to create a new passport.", example = "yes")
    private boolean needToCreatePp;

    @Size(max = 10, message = "NMRP no can not exceed 10 characters")
    @ApiModelProperty(notes = "NMRP no of passenger.", example = "1224578")
    private String nmrpNo;

    @ApiModelProperty(notes = "whether passport is from Normal or One day service.", example = "NORMAL", allowableValues = "NORMAL,ONE_DAY")
    private TypeOfService typeOfService;

    @ApiModelProperty(notes = "whether passport is for all countries or emergency certificate", example = "ALL_COUNTRIES", allowableValues = "ALL_COUNTRIES,MIDDLE_EAST_COUNTRIES,MERGENCY_CERTIFICATE,IDENTITY_CERTIFICATE")
    private TypeOfTravelDoc typeOfTravelDoc;

    @ApiModelProperty(notes = "whether went abroad before", example = "false")
    private boolean wentAbroadBefore;

    @Size(max = 4, message = "last migrate year can not exceed 4 characters")
    @ApiModelProperty(notes = "Year which last migration occured", example = "2017")
    private String lastMigrateYear;

    @ApiModelProperty(notes = "Whether old passport is with passenger", example = "true")
    private boolean oldPassportAvailability;

    @Size(max = 10, message = "old passport number can not exceed 10 characters")
    @ApiModelProperty(notes = "old passport number is passport available", example = "N1987812")
    private String oldPpNumber;

    @ApiModelProperty(notes = "old passport expire date in yyyy-MM-dd format if passport available", example = "2019-12-21")
    private String oldPpExpDate;

    @ApiModelProperty(notes = "whether a police report provided if old passport is misplaced", example = "false")
    private boolean policeRepAvailForOldPp;

    @ApiModelProperty(notes = "whether informed that penalty for a lost passport is Rs.10,000", example = "false")
    private boolean informPenaltyForLostPp;

    @ApiModelProperty(notes = "whether officer cross checked that passport is not expired for trip period", example = "false")
    private boolean confirmPPAvailForTrip;

    @ApiModelProperty(notes = "whether job title should be included in passport application", example = "true")
    private boolean includeJobInPp;

    @ApiModelProperty(notes = "whether job appointment letter received by office for including job title in passport", example = "true")
    private boolean jobAppointmntLtrRcvd;

    @ApiModelProperty(notes = "whether passenger holds dual citizenship", example = "false")
    private boolean dualCitizen;

    @Size(max = 12, message = "dual citizenship number can not exceed 12 characters")
    @ApiModelProperty(notes = "dual citizenship number if person holds dual citizenship", example = "4457866E")
    private String dualCitizenNo;

    @ApiModelProperty(notes = "foreign nationality of person holds dual citizenship", example = "Japanise")
    private String foreignNationality;

    @ApiModelProperty(notes = "foreign passport number of person holds dual citizenship", example = "458-JAPAN-568")
    private String foreignPpNo;

    @ApiModelProperty(notes = "whether fax form received id person holds dual citizenship", example = "false")
    private boolean faxFormDualCitizen;
    //endregion

    //region Special Requirements

    //age below 20
    @ApiModelProperty(notes = "whether parent approval letter received from passenger, if below 20 years old", example = "true")
    private boolean parentApprovalLetterReceived;

    @ApiModelProperty(notes = "whether mother NIC copy received from passenger, if below 20 years old", example = "true")
    private boolean motherNicCopyReceived;

    @ApiModelProperty(notes = "whether father NIC copy received from passenger, if below 20 years old", example = "true")
    private boolean fatherNicCopyReceived;

    @ApiModelProperty(notes = "whether mother Pasport copy received from passenger, if below 20 years old", example = "true")
    private boolean motherPpCopyReceived;

    @ApiModelProperty(notes = "whether father Passport copy received from passenger, if below 20 years old", example = "true")
    private boolean fatherPpCopyReceived;

    @ApiModelProperty(notes = "whether parent marriage certificate received from passenger, if below 20 years old", example = "true")
    private boolean parentMarriageCertificateReceived;

    @ApiModelProperty(notes = "whether passenger was informed that parent should come to passport office, if below 20 years old", example = "true")
    private boolean informedParentAccompany;

    @ApiModelProperty(notes = "whether parent certified letter received if parent does not come to passport office, if passenger is below 20 years old", example = "true")
    private boolean parentCertifiedLetter;

    @ApiModelProperty(notes = "whether owner certified letter received, if passenger is above 60 years old", example = "true")
    private boolean ownerCertifiedLetterOldPax;

    @ApiModelProperty(notes = "whether judge certified letter received, if passenger is above 70 years old", example = "true")
    private boolean judgeCertifiedLetterOldPax;

    //endregion

}
