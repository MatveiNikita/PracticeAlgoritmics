package Codewars_Learning;
import java.util.regex.Pattern;


public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));

    }
    static String toCamelCase(String s){
        return Pattern.compile("([^A-Za-z])(.)").matcher(s)
                .replaceAll(m -> m.group().toUpperCase())
                .replaceAll("[^A-Za-z]", "");
    }

}
