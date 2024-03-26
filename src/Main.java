import model.Pharmacy;
import service.PharmacyService;
import service.serviceImpl.PharmacyServiceImpl;

public class Main {
    public static void main(String[] args) {
        PharmacyService pharmacyService = new PharmacyServiceImpl();
        pharmacyService.savePharmacy(new Pharmacy());
        pharmacyService.getAllPharmacy();
        pharmacyService.getByIdPharmacy(1L);
        pharmacyService.updatePharmacyById(1L, new Pharmacy());
    }
}