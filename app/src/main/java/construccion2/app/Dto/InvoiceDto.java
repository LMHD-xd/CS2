
package construccion2.app.Dto;

import java.sql.Timestamp;

public class InvoiceDto {
    private long id;
    private PersonDto personDto;
    private PartnerDto partnerDto;
    private Timestamp dateCreated;
    private double amount;
    private String status;
    
    public InvoiceDto(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public PartnerDto getPartnerDto() {
        return partnerDto;
    }

    public void setPartnerDto(PartnerDto partnerDto) {
        this.partnerDto = partnerDto;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
}
