package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    Long id ;
    String name;
    Address address;
    public Person(Long id, String name, Address address) {

        this.id = id;
        this.name = name;
        //this.address = address;
        address.getAddressLine1();
        address.getAddressLine2();
        address.getCity();
        address.getState();
        address.getZipcode();

    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {

        this.address.getAddressLine1();
        this.address.getAddressLine2();
        this.address.getCity();
        this.address.getState();
        this.address.getZipcode();


        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}