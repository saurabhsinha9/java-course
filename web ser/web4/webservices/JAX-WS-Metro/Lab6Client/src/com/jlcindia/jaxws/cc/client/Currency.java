package com.jlcindia.jaxws.cc.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Currency.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name=&quot;Currency&quot;&gt;
 *   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;&gt;
 *     &lt;enumeration value=&quot;AFA&quot;/&gt;
 *     &lt;enumeration value=&quot;ALL&quot;/&gt;
 *     &lt;enumeration value=&quot;DZD&quot;/&gt;
 *     &lt;enumeration value=&quot;ARS&quot;/&gt;
 *     &lt;enumeration value=&quot;AWG&quot;/&gt;
 *     &lt;enumeration value=&quot;AUD&quot;/&gt;
 *     &lt;enumeration value=&quot;BSD&quot;/&gt;
 *     &lt;enumeration value=&quot;BHD&quot;/&gt;
 *     &lt;enumeration value=&quot;BDT&quot;/&gt;
 *     &lt;enumeration value=&quot;BBD&quot;/&gt;
 *     &lt;enumeration value=&quot;BZD&quot;/&gt;
 *     &lt;enumeration value=&quot;BMD&quot;/&gt;
 *     &lt;enumeration value=&quot;BTN&quot;/&gt;
 *     &lt;enumeration value=&quot;BOB&quot;/&gt;
 *     &lt;enumeration value=&quot;BWP&quot;/&gt;
 *     &lt;enumeration value=&quot;BRL&quot;/&gt;
 *     &lt;enumeration value=&quot;GBP&quot;/&gt;
 *     &lt;enumeration value=&quot;BND&quot;/&gt;
 *     &lt;enumeration value=&quot;BIF&quot;/&gt;
 *     &lt;enumeration value=&quot;XOF&quot;/&gt;
 *     &lt;enumeration value=&quot;XAF&quot;/&gt;
 *     &lt;enumeration value=&quot;KHR&quot;/&gt;
 *     &lt;enumeration value=&quot;CAD&quot;/&gt;
 *     &lt;enumeration value=&quot;CVE&quot;/&gt;
 *     &lt;enumeration value=&quot;KYD&quot;/&gt;
 *     &lt;enumeration value=&quot;CLP&quot;/&gt;
 *     &lt;enumeration value=&quot;CNY&quot;/&gt;
 *     &lt;enumeration value=&quot;COP&quot;/&gt;
 *     &lt;enumeration value=&quot;KMF&quot;/&gt;
 *     &lt;enumeration value=&quot;CRC&quot;/&gt;
 *     &lt;enumeration value=&quot;HRK&quot;/&gt;
 *     &lt;enumeration value=&quot;CUP&quot;/&gt;
 *     &lt;enumeration value=&quot;CYP&quot;/&gt;
 *     &lt;enumeration value=&quot;CZK&quot;/&gt;
 *     &lt;enumeration value=&quot;DKK&quot;/&gt;
 *     &lt;enumeration value=&quot;DJF&quot;/&gt;
 *     &lt;enumeration value=&quot;DOP&quot;/&gt;
 *     &lt;enumeration value=&quot;XCD&quot;/&gt;
 *     &lt;enumeration value=&quot;EGP&quot;/&gt;
 *     &lt;enumeration value=&quot;SVC&quot;/&gt;
 *     &lt;enumeration value=&quot;EEK&quot;/&gt;
 *     &lt;enumeration value=&quot;ETB&quot;/&gt;
 *     &lt;enumeration value=&quot;EUR&quot;/&gt;
 *     &lt;enumeration value=&quot;FKP&quot;/&gt;
 *     &lt;enumeration value=&quot;GMD&quot;/&gt;
 *     &lt;enumeration value=&quot;GHC&quot;/&gt;
 *     &lt;enumeration value=&quot;GIP&quot;/&gt;
 *     &lt;enumeration value=&quot;XAU&quot;/&gt;
 *     &lt;enumeration value=&quot;GTQ&quot;/&gt;
 *     &lt;enumeration value=&quot;GNF&quot;/&gt;
 *     &lt;enumeration value=&quot;GYD&quot;/&gt;
 *     &lt;enumeration value=&quot;HTG&quot;/&gt;
 *     &lt;enumeration value=&quot;HNL&quot;/&gt;
 *     &lt;enumeration value=&quot;HKD&quot;/&gt;
 *     &lt;enumeration value=&quot;HUF&quot;/&gt;
 *     &lt;enumeration value=&quot;ISK&quot;/&gt;
 *     &lt;enumeration value=&quot;INR&quot;/&gt;
 *     &lt;enumeration value=&quot;IDR&quot;/&gt;
 *     &lt;enumeration value=&quot;IQD&quot;/&gt;
 *     &lt;enumeration value=&quot;ILS&quot;/&gt;
 *     &lt;enumeration value=&quot;JMD&quot;/&gt;
 *     &lt;enumeration value=&quot;JPY&quot;/&gt;
 *     &lt;enumeration value=&quot;JOD&quot;/&gt;
 *     &lt;enumeration value=&quot;KZT&quot;/&gt;
 *     &lt;enumeration value=&quot;KES&quot;/&gt;
 *     &lt;enumeration value=&quot;KRW&quot;/&gt;
 *     &lt;enumeration value=&quot;KWD&quot;/&gt;
 *     &lt;enumeration value=&quot;LAK&quot;/&gt;
 *     &lt;enumeration value=&quot;LVL&quot;/&gt;
 *     &lt;enumeration value=&quot;LBP&quot;/&gt;
 *     &lt;enumeration value=&quot;LSL&quot;/&gt;
 *     &lt;enumeration value=&quot;LRD&quot;/&gt;
 *     &lt;enumeration value=&quot;LYD&quot;/&gt;
 *     &lt;enumeration value=&quot;LTL&quot;/&gt;
 *     &lt;enumeration value=&quot;MOP&quot;/&gt;
 *     &lt;enumeration value=&quot;MKD&quot;/&gt;
 *     &lt;enumeration value=&quot;MGF&quot;/&gt;
 *     &lt;enumeration value=&quot;MWK&quot;/&gt;
 *     &lt;enumeration value=&quot;MYR&quot;/&gt;
 *     &lt;enumeration value=&quot;MVR&quot;/&gt;
 *     &lt;enumeration value=&quot;MTL&quot;/&gt;
 *     &lt;enumeration value=&quot;MRO&quot;/&gt;
 *     &lt;enumeration value=&quot;MUR&quot;/&gt;
 *     &lt;enumeration value=&quot;MXN&quot;/&gt;
 *     &lt;enumeration value=&quot;MDL&quot;/&gt;
 *     &lt;enumeration value=&quot;MNT&quot;/&gt;
 *     &lt;enumeration value=&quot;MAD&quot;/&gt;
 *     &lt;enumeration value=&quot;MZM&quot;/&gt;
 *     &lt;enumeration value=&quot;MMK&quot;/&gt;
 *     &lt;enumeration value=&quot;NAD&quot;/&gt;
 *     &lt;enumeration value=&quot;NPR&quot;/&gt;
 *     &lt;enumeration value=&quot;ANG&quot;/&gt;
 *     &lt;enumeration value=&quot;NZD&quot;/&gt;
 *     &lt;enumeration value=&quot;NIO&quot;/&gt;
 *     &lt;enumeration value=&quot;NGN&quot;/&gt;
 *     &lt;enumeration value=&quot;KPW&quot;/&gt;
 *     &lt;enumeration value=&quot;NOK&quot;/&gt;
 *     &lt;enumeration value=&quot;OMR&quot;/&gt;
 *     &lt;enumeration value=&quot;XPF&quot;/&gt;
 *     &lt;enumeration value=&quot;PKR&quot;/&gt;
 *     &lt;enumeration value=&quot;XPD&quot;/&gt;
 *     &lt;enumeration value=&quot;PAB&quot;/&gt;
 *     &lt;enumeration value=&quot;PGK&quot;/&gt;
 *     &lt;enumeration value=&quot;PYG&quot;/&gt;
 *     &lt;enumeration value=&quot;PEN&quot;/&gt;
 *     &lt;enumeration value=&quot;PHP&quot;/&gt;
 *     &lt;enumeration value=&quot;XPT&quot;/&gt;
 *     &lt;enumeration value=&quot;PLN&quot;/&gt;
 *     &lt;enumeration value=&quot;QAR&quot;/&gt;
 *     &lt;enumeration value=&quot;ROL&quot;/&gt;
 *     &lt;enumeration value=&quot;RUB&quot;/&gt;
 *     &lt;enumeration value=&quot;WST&quot;/&gt;
 *     &lt;enumeration value=&quot;STD&quot;/&gt;
 *     &lt;enumeration value=&quot;SAR&quot;/&gt;
 *     &lt;enumeration value=&quot;SCR&quot;/&gt;
 *     &lt;enumeration value=&quot;SLL&quot;/&gt;
 *     &lt;enumeration value=&quot;XAG&quot;/&gt;
 *     &lt;enumeration value=&quot;SGD&quot;/&gt;
 *     &lt;enumeration value=&quot;SKK&quot;/&gt;
 *     &lt;enumeration value=&quot;SIT&quot;/&gt;
 *     &lt;enumeration value=&quot;SBD&quot;/&gt;
 *     &lt;enumeration value=&quot;SOS&quot;/&gt;
 *     &lt;enumeration value=&quot;ZAR&quot;/&gt;
 *     &lt;enumeration value=&quot;LKR&quot;/&gt;
 *     &lt;enumeration value=&quot;SHP&quot;/&gt;
 *     &lt;enumeration value=&quot;SDD&quot;/&gt;
 *     &lt;enumeration value=&quot;SRG&quot;/&gt;
 *     &lt;enumeration value=&quot;SZL&quot;/&gt;
 *     &lt;enumeration value=&quot;SEK&quot;/&gt;
 *     &lt;enumeration value=&quot;CHF&quot;/&gt;
 *     &lt;enumeration value=&quot;SYP&quot;/&gt;
 *     &lt;enumeration value=&quot;TWD&quot;/&gt;
 *     &lt;enumeration value=&quot;TZS&quot;/&gt;
 *     &lt;enumeration value=&quot;THB&quot;/&gt;
 *     &lt;enumeration value=&quot;TOP&quot;/&gt;
 *     &lt;enumeration value=&quot;TTD&quot;/&gt;
 *     &lt;enumeration value=&quot;TND&quot;/&gt;
 *     &lt;enumeration value=&quot;TRL&quot;/&gt;
 *     &lt;enumeration value=&quot;USD&quot;/&gt;
 *     &lt;enumeration value=&quot;AED&quot;/&gt;
 *     &lt;enumeration value=&quot;UGX&quot;/&gt;
 *     &lt;enumeration value=&quot;UAH&quot;/&gt;
 *     &lt;enumeration value=&quot;UYU&quot;/&gt;
 *     &lt;enumeration value=&quot;VUV&quot;/&gt;
 *     &lt;enumeration value=&quot;VEB&quot;/&gt;
 *     &lt;enumeration value=&quot;VND&quot;/&gt;
 *     &lt;enumeration value=&quot;YER&quot;/&gt;
 *     &lt;enumeration value=&quot;YUM&quot;/&gt;
 *     &lt;enumeration value=&quot;ZMK&quot;/&gt;
 *     &lt;enumeration value=&quot;ZWD&quot;/&gt;
 *     &lt;enumeration value=&quot;TRY&quot;/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

	AFA, ALL, DZD, ARS, AWG, AUD, BSD, BHD, BDT, BBD, BZD, BMD, BTN, BOB, BWP, BRL, GBP, BND, BIF, XOF, XAF, KHR, CAD, CVE, KYD, CLP, CNY, COP, KMF, CRC, HRK, CUP, CYP, CZK, DKK, DJF, DOP, XCD, EGP, SVC, EEK, ETB, EUR, FKP, GMD, GHC, GIP, XAU, GTQ, GNF, GYD, HTG, HNL, HKD, HUF, ISK, INR, IDR, IQD, ILS, JMD, JPY, JOD, KZT, KES, KRW, KWD, LAK, LVL, LBP, LSL, LRD, LYD, LTL, MOP, MKD, MGF, MWK, MYR, MVR, MTL, MRO, MUR, MXN, MDL, MNT, MAD, MZM, MMK, NAD, NPR, ANG, NZD, NIO, NGN, KPW, NOK, OMR, XPF, PKR, XPD, PAB, PGK, PYG, PEN, PHP, XPT, PLN, QAR, ROL, RUB, WST, STD, SAR, SCR, SLL, XAG, SGD, SKK, SIT, SBD, SOS, ZAR, LKR, SHP, SDD, SRG, SZL, SEK, CHF, SYP, TWD, TZS, THB, TOP, TTD, TND, TRL, USD, AED, UGX, UAH, UYU, VUV, VEB, VND, YER, YUM, ZMK, ZWD, TRY;

	public String value() {
		return name();
	}

	public static Currency fromValue(String v) {
		return valueOf(v);
	}

}
