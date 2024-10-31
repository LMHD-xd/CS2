
package construccion2.app.Dao.Interfaces;

public interface PartnerDao {
    public void createGuest()throws Exception;
    public void activateGuest()throws Exception;
    public void deactivateGuest()throws Exception;
    public void Consumption()throws Exception;
    public void increaseFounds()throws Exception;
    public void requestDischarge()throws Exception;
    public void PromotionVIP()throws Exception;
}
