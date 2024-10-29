
package Dto;

public class GuestDto {
    private long id;
    private UserDto userDto;
    private PartnerDto partnerDto;
    private String status;
    
    public GuestDto(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public PartnerDto getPartnerDto() {
        return partnerDto;
    }

    public void setPartnerDto(PartnerDto partnerDto) {
        this.partnerDto = partnerDto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
