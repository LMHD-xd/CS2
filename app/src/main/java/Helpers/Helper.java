
package Helpers;

import Dto.GuestDto;
import Dto.InvoiceDetailDto;
import Dto.InvoiceDto;
import Dto.PartnerDto;
import Dto.PersonDto;
import Dto.UserDto;
import Modelo.Guest;
import Modelo.Invoice;
import Modelo.InvoiceDetail;
import Modelo.Partner;
import Modelo.Person;
import Modelo.User;

public abstract class Helper {
    public static PersonDto parse (Person person){
        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setDocument(person.getDocument());
        personDto.setCellphone(person.getCellphone());
        personDto.setName(person.getName());
        return personDto;
    }
    
    public static Person parse (PersonDto personDto){
        Person person = new Person();
        person.setId(personDto.getId());
        person.setDocument(personDto.getDocument());
        person.setCellphone(personDto.getCellphone());
        person.setName(personDto.getName());
        return person;
    }
    
    public static UserDto parse (User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());
        userDto.setPersonId(parse(user.getPersonId()));
        return userDto;
    }
    
    public static User parse (UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setRole(userDto.getRole());
        user.setPersonId(parse(userDto.getPersonId()));
        return user;
    }
    
    public static PartnerDto parse (Partner partner){
        PartnerDto partnerDto = new PartnerDto();
        partnerDto.setId(partner.getId());
        partnerDto.setType(partner.getType());
        partnerDto.setMoney(partner.getMoney());
        partnerDto.setDatecreated(partner.getDateCreated());
        partnerDto.setUserId(parse(partner.getUserId()));
        return partnerDto;
    }
    
    public static Partner parse (PartnerDto partnerDto){
        Partner partner = new Partner();
        partner.setId(partnerDto.getId());
        partner.setType(partnerDto.getType());
        partner.setMoney(partnerDto.getMoney());
        partner.setDateCreated(partnerDto.getDatecreated());
        partner.setUserId(parse(partnerDto.getUserId()));
        return partner;
    }
    
    public static GuestDto parse (Guest guest){
        GuestDto guestDto = new GuestDto();
        guestDto.setId(guest.getId());
        guestDto.setStatus(guest.getStatus());
        guestDto.setUserDto(parse(guest.getUserId()));
        guestDto.setPartnerDto(parse(guest.getPartnedId()));
        return guestDto;
    }
    
    public static Guest parse (GuestDto guestDto){
        Guest guest = new Guest();
        guest.setId(guestDto.getId());
        guest.setStatus(guestDto.getStatus());
        guest.setUserId(parse(guestDto.getUserDto()));
        guest.setPartnedId(parse(guestDto.getPartnerDto()));
        return guest;
    }
    
    public static InvoiceDto parse (Invoice invoice){
        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setId(invoice.getId());
        invoiceDto.setStatus(invoice.getStatus());
        invoiceDto.setDateCreated(invoice.getDateCerated());
        invoiceDto.setAmount(invoice.getAmount());
        invoiceDto.setPersonDto(parse(invoice.getPersonId()));
        invoiceDto.setPartnerDto(parse(invoice.getPartnerId()));
        return invoiceDto;
    }
    
    public static Invoice parse (InvoiceDto invoiceDto){
        Invoice invoice = new Invoice();
        invoice.setId(invoiceDto.getId());
        invoice.setStatus(invoiceDto.getStatus());
        invoice.setDateCerated(invoiceDto.getDateCreated());
        invoice.setAmount(invoiceDto.getAmount());
        invoice.setPartnerId(parse(invoiceDto.getPartnerDto()));
        invoice.setPersonId(parse(invoiceDto.getPersonDto()));
        return invoice;
    }
    
    public static InvoiceDetailDto parse (InvoiceDetail invoiceDetail){
        InvoiceDetailDto invoiceDetailDto = new InvoiceDetailDto();
        invoiceDetailDto.setId(invoiceDetail.getId());
        invoiceDetailDto.setItem(invoiceDetail.getItem());
        invoiceDetailDto.setDescription(invoiceDetail.getDescription());
        invoiceDetailDto.setAmount(invoiceDetail.getAmount());
        invoiceDetailDto.setInvoiceDto(parse(invoiceDetail.getInvoiceId()));
        return invoiceDetailDto;
    }
    
    public static InvoiceDetail parse (InvoiceDetailDto invoiceDetailDto){
        InvoiceDetail invoiceDetail = new InvoiceDetail();
        invoiceDetail.setId(invoiceDetailDto.getId());
        invoiceDetail.setItem(invoiceDetailDto.getItem());
        invoiceDetail.setDescription(invoiceDetailDto.getDescription());
        invoiceDetail.setAmount(invoiceDetailDto.getAmount());
        invoiceDetail.setInvoiceId(parse(invoiceDetailDto.getInvoiceDto()));
        return invoiceDetail;
    }
}
