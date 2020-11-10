package Java8.JavaDateTime;

import java.util.Locale;

public class Ex17_Locale {
    public static void main(String[] args) {

        // create a new locale
        Locale locale1 = new Locale("ENGLISH", "US");

        // print this locale
        System.out.println("Locale1:" + locale1);

        // create a second locale
        Locale locale2 = new Locale("GERMANY", "GERMAN");

        // compare two locales
        System.out.println("Locales are equal:" + locale1.equals(locale2));

        // create a third locale
        Locale locale3 = new Locale("ENGLISH", "US");

        // compare locale1 and locale3
        System.out.println("Locales are equal:" + locale1.equals(locale3));
    }
}

/*
Field
Following are the fields for java.util.Locale class −
static Locale CANADA − This is the constant for country.
static Locale CANADA FRENCH − This is the constant for country.
static Locale CHINA − This is the constant for country.
static Locale CHINESE − This is the constant for language.
static Locale ENGLISH − This is the constant for language.
static Locale FRANCE − This is the constant for country.
static Locale FRENCH − This is the constant for language.
static Locale GERMAN − This is the constant for language.
static Locale GERMANY − This is the constant for country.
static Locale ITALIAN − This is the constant for language.
static Locale ITALY − This is the constant for country.
static Locale JAPAN − This is the constant for country.
static Locale JAPANESE − This is the constant for language.
static Locale KOREA − This is the constant for country.
static Locale KOREAN − This is the constant for language.
static Locale PRC − This is the constant for country.
static Locale ROOT − This is the constant for root locale.
static Locale SIMPLIFIED CHINESE − This is the constant for language.
static Locale TAIWAN − This is the constant for country.
static Locale TRADITIONAL CHINESE − This is the constant for language.
static Locale UK − This is the constant for country.
static Locale US − This is the constant for country.


Class constructors
Sr.No.	Constructor & Description
1	    Locale(String language)                             This constructs a locale from a language code.
2	Locale(String language, String country)                 This constructs a locale from a language code.
3	Locale(String language, String country, String variant) This constructs a locale from language, country, variant.

Class methods
Sr.No.	Method & Description
1	Object clone()
This method overrides Cloneable

2	boolean equals(Object obj)
This method returns true if this Locale is equal to another object.

3	static Locale[] getAvailableLocales()
This method returns an array of all installed locales.

4	String getCountry()
This method returns the country/region code for this locale, which will either be the empty string or an uppercase ISO 3166 2-letter code.

5	static Locale getDefault()
This method gets the current value of the default locale for this instance of the Java Virtual Machine.

6	String getDisplayCountry()
This method returns a name for the locale's country that is appropriate for display to the user.

7	S String getDisplayCountry(Locale inLocale)
This method Returns a name for the locale's country that is appropriate for display to the user.

8	String getDisplayLanguage()
This method returns a name for the locale's language that is appropriate for display to the user.

9	String getDisplayLanguage(Locale inLocale)
This method returns a name for the locale's language that is appropriate for display to the user.

10	String getDisplayName()
This method returns a name for the locale that is appropriate for display to the user.

11	String getDisplayName(Locale inLocale)
This method returns a name for the locale that is appropriate for display to the user.

12	String getDisplayVariant()
This method returns a name for the locale's variant code that is appropriate for display to the user.

13	String getDisplayVariant(Locale inLocale)
This method returns a name for the locale's variant code that is appropriate for display to the user.

14	String getISO3Country()
This method returns a three-letter abbreviation for this locale's country.

15	String getISO3Language()
This method returns returns a three-letter abbreviation for this locale's language.

16	static String[] getISOCountries()
This method returns a list of all 2-letter country codes defined in ISO 3166.

17	static String[] getISOLanguages()
This method returns a list of all 2-letter language codes defined in ISO 639.

18	String getLanguage()
This method returns the language code for this locale, which will either be the empty string or a lowercase ISO 639 code.

19	String getVariant()
This method returns the variant code for this locale.

20	int hashCode()
This method override hashCode.

21	static void setDefault(Locale newLocale)
This method sets the default locale for this instance of the Java Virtual Machine.

22	String toString()
This method is the getter for the programmatic name of the entire locale, with the language, country and variant separated by underbars.



 */