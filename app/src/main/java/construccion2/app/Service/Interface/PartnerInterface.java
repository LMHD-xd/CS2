
package construccion2.app.Service.Interface;

import construccion2.app.Dto.GuestDto;

public interface PartnerInterface {
    public void createGuest(GuestDto guestDto)throws Exception;
    public void activateGuest()throws Exception;
    public void deactivateGuest()throws Exception;
    public void Consumption()throws Exception;
    public void increaseFounds()throws Exception;
    public void requestDischarge()throws Exception;
    public void PromotionVIP()throws Exception;
}
