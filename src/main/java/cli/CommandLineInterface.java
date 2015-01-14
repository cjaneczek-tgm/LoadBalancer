package cli;

import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.CommandLine;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.commandline.Parser;

/**
 * Die Klasse CommandLineInterface dient allein zur Verwaltung der Konsoleneingabe
 * des Benutzers und dessen eingegebene Argumente.
 *
 * @author Christian Janeczek
 * @version 2015-01-14
 */
public class CommandLineInterface {

    private String type, count, behavior, address;

    /**
     * Der Konstruktor der Klasse CommandLineInterface
     *
     * @param args Die eingegebenen Argumente des Benutzers
     * @throws OptionException
     */
    public CommandLineInterface(String[] args) throws OptionException {

        DefaultOptionBuilder dob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();
        GroupBuilder gb = new GroupBuilder();

        //Hier werden die einzelnen Optionen des CommandLineInterfaces deklariert und initialisiert.
        DefaultOption type_option = dob.withLongName("type").withShortName("t").withRequired(true).withDescription("Der zu deklarierende Typ(Server, Client, LoadBalancer)")
                .withArgument(ab.withName("type").withMinimum(1).withMaximum(1).create()).create();
        DefaultOption count_option = dob.withLongName("count").withShortName("c").withRequired(true).withDescription("Die Anzahl der Clients")
                .withArgument(ab.withName("count").withMinimum(1).withMaximum(1).create()).create();
        DefaultOption password_option = dob.withLongName("behavior").withShortName("b").withRequired(true).withDescription("Das zu benutzende Behavior(sowohl Server als auch LoadBalancer)")
                .withArgument(ab.withName("behavior").withMinimum(1).withMaximum(1).create()).create();
        DefaultOption address_option = dob.withLongName("address").withShortName("a").withRequired(true).withDescription("Die Adresse des LoadBalancers")
                .withArgument(ab.withName("address").withMinimum(1).withMaximum(1).create()).create();
        Group options = gb.withName("options").withOption(type_option).withOption(count_option).withOption(password_option).withOption(address_option).create();

        Parser parser = new Parser();
        parser.setGroup(options);
        CommandLine cl = parser.parse(args);
        this.type = (String)cl.getValue(type_option);
        this.count = (String)cl.getValue(count_option);
        this.behavior = (String)cl.getValue(password_option);
        this.address = (String)cl.getValue(address_option);
    }
    /**
     * Gibt den zu verwendeten Typ zurück
     * Server, Client, Balancer
     * return type als String
     */
    public String getType() {
        return this.type;
    }
    /**
     * Gibt die Anzahl der zu erstellenden Clients zurück
     * @return count als String
     */
    public String getCount() {
        return this.count;
    }
    /**
     * Gibt das Behavior des Server und des LoadBalancers zurück
     * @return Behavior als String
     */
    public String getBehavior() {
        return this.behavior;
    }
    /**
     * Gibt die Adresse des LoadBalancers zurück
     * @return address als String
     */
    public String getAddress() {
        return this.address;
    }
}