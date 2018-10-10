package com.uwp.utils;



/**
 * This Class is to define all error constants
 * 
 * @author Optimus
 *
 */

public class ErrorConstants {

	//Error Constants
		public static final String PROCESS_ID_BLANK_ERROR = "required fields - process_id can't be empty";
		public static final String ORDER_ID_BLANK_ERROR = "required fields - order_id can't be empty";
		public static final String AMOUNT_FIELD_BLANK_ERROR = "required fields - amount can't be empty";
		public static final String COLLECT_LEVEL3_DATA_FIELD_BLANK_ERROR = "Internal Server Error";
		public static final String MOBILE_DEVICE_FIELD_BLANK_ERROR = "Internal Server Error";
		public static final String APP_COUNTRY_FIELD_BLANK_ERROR = "required fields - app_country can't be empty";
		public static final String IS_FRONT_END_DELIVERY_ORDER_FIELD_BLANK_ERROR = "Internal Server Error";
		public static final String STORE_CC_TOKEN_FIELD_BLANK_ERROR = "Internal Server Error";
		public static final String USERNAME_FIELD_BLANK_ERROR = "required fields - mid-settings->mid_username can't be empty";
		public static final String MID_USERNAME_KEY_INVALID_ERROR = "problem : Missing/incorrect password";
		public static final String MID_USERNAME_KEY_INVALID_AUTHMESSAGE = "Missing/incorrect password";
		public static final String MID_USERNAME_FIELD_BLANK_ERROR = "problem : required fields - mid-settings->mid_username can't be empty";
		public static final String MID_KEY_FIELD_BLANK_ERROR = "problem : required fields - mid-settings->mid_key can't be empty";
		public static final String KEY_FIELD_BLANK_MERRMSG = "required fields - mid-settings->mid_key can't be empty";
		public static final String PROCESS_ID_REUSED_ERROR = "problem : Illegal auth: orderid has already been used";
		public static final String MSG_PROCESS_ID_REUSED = "Illegal auth: orderid has already been used";
		public static final String INVALID_TRANSACTION_TOKEN_ERROR = "problem : Username does not exist." ;
		public static final String INVALID_TRANSACTION_TOKEN_MERRMSG = "Username does not exist.";
		public static final String REST_AMOUNT_FIELD_BLANK_ERROR = "problem : required fields - amount can't be empty";
		public static final String DUPLICATE_PROCESS_ID_ERROR = "problem : Duplicate return";
		public static final String DUPLICATE_PROCESS_ID_AUTH_MESSAGE = "Duplicate return";
		public static final String RET_REFUND_PROCESS_ID_BLANK_ERROR = "problem : required fields - process_id can't be empty";
		public static final String RET_REFUND_PREV_PROCESS_ID_BLANK_ERROR = "problem : required fields - prev_process_id can't be empty";
		public static final String RET_REFUND_TX_TAG_BLANK_ERROR = "problem : required fields - transaction_tag can't be empty";
		public static final String PREV_PROCESS_ID_BLANK_ERROR = "required fields - prev_process_id can't be empty";
		public static final String TX_TAG_BLANK_ERROR = "required fields - transaction_tag can't be empty";
		public static final String USING_PREV_PROCESS_ID_USED_ERROR = "problem : No previous billing information found.";
		public static final String USING_PREV_PROCESS_ID_USED_MERRORMSG = "No previous billing information found.";
		public static final String REFUND_AMOUNT_FIELD_BLANK_ERROR = "problem : required fields - amount can't be empty";
		public static final String REFUND_STORECODE_FIELD_BLANK_ERROR = "problem : required fields - store_code can't be empty";
		public static final String REFUND_STORECODE_FIELD_BLANK_MERRORMSG = "required fields - store_code can't be empty";
		public static final String REFUND_ORDER_ID_BLANK_ERROR = "problem : required fields - order_id can't be empty";
		public static final String DUPLICATE_API_SUCCESS_MESSAGE = "success : Duplicate void: ";
		public static final String DUPLICATE_API_SUCCESS_MESSAGE_OLDPNP = "problem : Duplicate void: ";
		public static final String DUPLICATE_API_SUCCESS_MERRORMESSAGE = "Duplicate void: ";
		public static final String INVALID_PREV_PROCESS_ID_API_ERROR = "problem : Missing information. void transaction failed.";
		public static final String INVALID_PREV_PROCESS_ID_MERRORMSG = "Missing information. void transaction failed.";
		public static final String SUCCESSFULLY_VOIDED_AUTH_MESSAGE = "has been successfully voided.";
		public static final String SUCCESSFULLY_MARKED_AUTH_MESSAGE = "has been successfully marked for settlement.";
		public static final String DUPLICATE_AUTH_MESSAGE = "Duplicate postauth:";
		public static final String NOT_MARKED_AUTH_MESSAGE = "Transaction may not be marked.";
		public static final String NOT_MARKED_API_MESSAGE = "problem : Transaction may not be marked.";
		public static final String MEMBER_ID_BILLING_ID_BLANK_ERROR = "Error in creating Remote API request null";
		public static final String MEMBER_ID_BILLING_ID_BLANK_API_MESSAGE = "problem : Error in creating Remote API request null";
		public static final String BLANK_TRANSACTION_TOKEN_ERROR = "problem : required fields - transaction_token can't be empty";
		public static final String BLANK_TRANSACTION_TOKEN_MERRORMSG = "required fields - transaction_token can't be empty";
		public static final String REST_BLANK_BIN_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->bin can't be empty";
		public static final String REST_BLANK_INDUSTRYTYPE_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields industry_type can't be empty";
		
		//Below fields are used for FirstData API
		public static final String BILLING_ID_BLANK_MESSAGE = "required fields billing_id can't be empty";
		public static final String AMOUNT_BLANK_MESSAGE = "required fields amount can't be empty";
		public static final String CURRENCY_BLANK_MESSAGE = "required fields currency can't be empty";
		public static final String FDF_GGE4XFP4SEQUENCE_BLANK_MESSAGE = "required fields mid-settings->gge4_xfpsequence can't be empty";
		public static final String FDF_GGE4XLOGIN_BLANK_MESSAGE = "required fields mid-settings->gge4_xlogin can't be empty";
		public static final String FDF_GGE4XEXACTID_BLANK_MESSAGE = "required fields mid-settings->gge4_exactid can't be empty";
		public static final String FDF_GGE4TRANSACTIONKEY_BLANK_MESSAGE = "required fields mid-settings->gge4_transactionkey can't be empty";
		public static final String FDF_THRESHOLDPERCENT_MIDID_BLANK_MESSAGE = "Could not read document";
		public static final String FDF_GGE4KEYID_GGE4XFPSEQUENCE_BLANK_MESSAGE = "Could not read document";
		public static final String FDF_CARD_NUMBER_BLANK_ERROR_MESSAGE = "String index out of range: -4";
		public static final String FDF_TRANSACTION_ERROR_BLANK_ERROR_MESSAGE = "TRANSACTION HAS BEEN APPROVED";
		public static final String FDF_REST_PROCESSID_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields process_id can't be empty";
		//public static final String FDF_REST_PREVPROCESSID_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields prev_process_id can't be empty";
		public static final String FDF_REST_TX_TAG_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields transaction_tag can't be empty";
		public static final String FDF_REST_BILLINGID_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields billing_id can't be empty";
		public static final String FDF_REST_AMOUNT_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields amount can't be empty";
		public static final String FDF_REST_CURRENCY_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields currency can't be empty";
		public static final String FDF_REST_AUTHCODE_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields auth_code can't be empty";
		public static final String FDF_REST_TRANSACTIONTOKEN_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields transaction_token can't be empty";
		public static final String FDF_REST_CARDTYPE_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields card_type can't be empty";
		public static final String FDF_REST_CARDEXP_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields card_exp can't be empty";
		public static final String FDF_REST_CARDNAME_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields card_name can't be empty";
		public static final String FDF_REST_GGE4PASSWORD_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields mid-settings->gge4_password can't be empty";
		public static final String FDF_REST_GGE4EXACTID_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields mid-settings->gge4_exactid can't be empty";
		public static final String FDF_REST_GGE4HMACKEY_BLANK_ERROR_MESSAGE = "Error at Java Middleware required fields mid-settings->gge4_hmac_key can't be empty";
		public static final String FDF_REST_GGE4PASSWORD_GGE4EXACTID_INVALID_ERROR_MESSAGE = "Unauthorized Request. Bad or missing credentials.";
		public static final String FDF_REST_CARDEXP_INVALID_ERROR_MESSAGE = "Bad Request (25) - Invalid Expiry Date";
		public static final String FDF_REST_TRANSACTIONTOKEN_INVALID_ERROR_MESSAGE = "Bad Request (22) - Invalid Credit Card Number";
		public static final String FDF_REST_AMOUNT_INVALID_ERROR_MESSAGE = "Bad Request (26) - Invalid Amount";
		public static final String FDF_REST_CURRENCY_INVALID_ERROR_MESSAGE = "Bad Request (95) - Invalid Currency Requested";
		public static final String FDF_REST_PREVPROCESSID_INVALID_ERROR_MESSAGE = "Bad Request (07) - Invalid Attribute (transaction_tag)";
		public static final String FDF_REST_AUTHCODE_INVALID_ERROR_MESSAGE = "Bad Request (69) - Invalid Transaction Tag";
		public static final String FDF_REST_AUTHCODE_PREVPROCESSID_TWICE_ERROR_MESSAGE = "Bad Request (64) - Invalid Refund";
				
		//Below fields are used for UsaePay API
		//public static final String USAEPAY_FORM_SOURCEKEY_BLANK_ERROR = "required fields mid-settings->source_key can't be empty";
		public static final String USAEPAY_FORM_SOURCEKEY_BLANK_ERROR = "required fields mid-settings->profile_source_key can't be empty";
		public static final String USAEPAY_FORM_API_SOURCE_KEY_BLANK_ERROR = "required fields mid-settings->api_source_key can't be empty";
		public static final String USAEPAY_SEED_BLANK_ERROR = "required fields mid-settings->seed can't be empty";
		//public static final String USAEPAY_PIN_BLANK_ERROR = "required fields mid-settings->pin can't be empty";
		public static final String USAEPAY_PROFILE_PIN_BLANK_ERROR = "required fields mid-settings->profile_pin can't be empty";
		public static final String USAEPAY_API_PIN_BLANK_ERROR = "required fields mid-settings->api_pin can't be empty";
		public static final String PROCESSID_BLANK_ERROR = "required fields process_id can't be empty";
		public static final String USAEPAY_FIELDS_BLANK_MESSAGE = "Could not read document";
		public static final String USAEPAY_UMMASKEDCARDNUM_BLANK_ERROR_MESSAGE = "String index out of range: -4";
		//public static final String USAEPAY_REST_SOURCEKEY_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->source_key can't be empty";
		public static final String USAEPAY_REST_API_SOURCEKEY_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->api_source_key can't be empty";
		public static final String USAEPAY_REST_SEED_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->seed can't be empty";
		//public static final String USAEPAY_REST_PIN_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->pin can't be empty";
		public static final String USAEPAY_REST_API_PIN_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->api_pin can't be empty";
		public static final String REST_TX_TAG_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields transaction_tag can't be empty";
		public static final String REST_AMOUNT_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields amount can't be empty";
		public static final String USAEPAY_REST_SOURCEKEY_INVALID_ERROR_MESSAGE = "SOAP-ENV:Server : 23: Specified source key not found.";
		public static final String USAEPAY_REST_PIN_INVALID_ERROR_MESSAGE = "SOAP-ENV:Server : 20008: Unable to validate request.  Check pin and try again.";
		public static final String USAEPAY_REST_PREVPROCESSID_AMOUNT_INVALID_ERROR_MESSAGE = "SOAP-ENV:Server : SOAP-ERROR: Encoding: Violation of encoding rules";
		public static final String REST_PROCESSID_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields process_id can't be empty";
		public static final String REST_TRANSACTIONTOKEN_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields transaction_token can't be empty";
		public static final String REST_TRANSACTIONTOKEN_BLANK_ERROR_MESSAGE_TEMP = "Invalid Transaction Status";
		public static final String USAEPAY_REST_CARDTYPE_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields card_type can't be empty";
		public static final String USAEPAY_REST_CURRENCY_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields currency can't be empty";
		public static final String USAEPAY_REST_BILLINGID_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields billing_id can't be empty";
		public static final String USAEPAY_REST_TRANSACTIONTOKEN_INVALID_ERROR_MESSAGE = "Invalid Card Number (1)";
		public static final String USAEPAY_REST_FAULTSTRING_SOURCEKEY_INVALID_ERROR_MESSAGE = "23: Specified source key not found.";
		public static final String USAEPAY_REST_FAULTSTRING_PIN_INVALID_ERROR_MESSAGE = "20008: Unable to validate request.  Check pin and try again.";
		public static final String USAEPAY_REST_FAULTSTRING_PREVPROCESSID_AMOUNT_INVALID_ERROR_MESSAGE = "SOAP-ERROR: Encoding: Violation of encoding rules";
		public static final String USAEPAY_REST_DEPOSIT_PROFILEPREAUTH_SUCCESS_APIMESSAGE = "Approved";
		public static final String USAEPAY_REST_PREVPROCESSID_REUSED_APIMESSAGE = "SOAP-ENV:Server : 24: Transaction already voided.";
		public static final String USAEPAY_REST_PREVPROCESSID_REUSED_FAULTSTRING = "24: Transaction already voided.";

		//Below fields are used for BeanStream API
		public static final String BS_MIDUSERNAME_BLANK_ERROR_MESSAGE = "Error at Java Middleware form: required fields - midSettings->mid_username can't be empty";
		public static final String BS_PROCESSID_BLANK_ERROR_MESSAGE = "Error at Java Middleware form: required fields - process_id can't be empty";
		public static final String BS_AMOUNT_BLANK_ERROR_MESSAGE = "Error at Java Middleware form: required fields - amount can't be empty";
		public static final String BS_DUPLICATEFIELD_ERROR_MESSAGE = "Duplicate Transaction - This transaction has already been approved";
		public static final String BS_REST_MIDUSERNAME_BLANK_ERROR_MESSAGE = "required fields - midSettings->mid_username can't be empty";
		public static final String BS_REST_MIDKEY_BLANK_ERROR_MESSAGE = "required fields - midSettings->mid_key can't be empty";
		public static final String BS_REST_MIDUSERNAME_INVALID_ERROR_MESSAGE = "Invalid merchant id";
		public static final String BS_REST_MIDKEY_INVALID_ERROR_MESSAGE = "CALL HELP DESK";		
		public static final String BS_REST_AMOUNT_INVALID_ERROR_MESSAGE = "error in monkey request for return transaction requestFor input string: \"invalid\"" ;
		public static final String BS_REST_PREVPROCESSID_INVALID_ERROR_MESSAGE = "Internal Server Error : JSONObject[\"MErrMsg\"] not found." ;
		public static final String BS_REST_PREVPROCESSID_TRNTOKEN_UNKNOWN_ERROR_MESSAGE = "Missing or invalid payment information - Please validate all required payment information." ;
		public static final String BS_REST_PREVPROCESSID_USED_TWICE_ERROR_MESSAGE = "Transaction exceeds return limit." ;
		public static final String BS_REST_DEPOSIT_AMOUNT_INVALID_ERROR_MESSAGE = "error in monkey request for  profile sale transaction requestFor input string: \"invalid\"" ;
		public static final String BS_REST_DEPOSITRETURN_AMOUNT_INVALID_ERROR_MESSAGE = "error in monkey request for void transaction requestFor input string: \"invalid\"" ;
		public static final String BS_REST_DEPOSITRETURN_SAME_PREVPROCESSID_ERROR_MESSAGE = "Amount does not match the transaction you are modifying." ;
		public static final String BS_REST_CAPTURE_AMOUNT_INVALID_ERROR_MESSAGE = "error in monkey request for capture transaction requestFor input string: \"invalid\"" ;
		public static final String BS_RC_PREVPROCESSID_USED_TWICE_ERROR_MESSAGE = "Completion greater than remaining reserve amount." ;
		public static final String BS_REST_PROFILEPREAUTH_AMOUNT_INVALID_ERROR_MESSAGE = "error in monkey request for  profile preauth transaction requestFor input string: \"invalid\"" ;
		
		//Below fields are used for VantivPay API
		public static final String VP_MIDUSERNAME_BLANK_ERROR_MESSAGE = "required fields mid-settings->mid_username can't be empty";
		public static final String VP_MIDKEY_BLANK_ERROR_MESSAGE = "required fields mid-settings->mid_key can't be empty";
		public static final String VP_APPLICATIONID_BLANK_ERROR_MESSAGE = "required fields mid-settings->application_id can't be empty";
		public static final String VP_MERCHANTID_BLANK_ERROR_MESSAGE = "required fields mid-settings->merchant_id can't be empty";
		public static final String VP_TERMINALID_BLANK_ERROR_MESSAGE = "required fields mid-settings->terminal_id can't be empty";
		public static final String SUCCESS_URL_BLANK_MESSAGE = "required fields success_url can't be empty";
		public static final String CALLBACK_BLANK_MESSAGE = "required fields callback_link can't be empty";
		public static final String VP_INVALID_MIDUSERNAME_ERROR = "The 'https://transaction.elementexpress.com:AccountID' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string 'invalid' is not a valid Integer value.";
		public static final String VP_INVALID_MIDKEY_ERROR = "Invalid AccountToken";
		public static final String VP_INVALID_APPLICATIONID_ERROR = "The 'https://transaction.elementexpress.com:ApplicationID' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string 'invalid' is not a valid Integer value.";
		public static final String VP_INVALID_MERCHANTID_ERROR = "Invalid Account";
		public static final String VP_INVALID_AMOUNT_ERROR = "The 'https://transaction.elementexpress.com:TransactionAmount' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:decimal' - The string 'invalid' is not a valid Decimal value.";
		public static final String REST_MIDUSERNAME_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->mid_username can't be empty";
		public static final String REST_MIDKEY_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->mid_key can't be empty";
		public static final String VP_REST_APPLICATIONID_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->application_id can't be empty";
		public static final String REST_MERCHANTID_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->merchant_id can't be empty";
		public static final String REST_TERMINALID_BLANK_ERROR_MESSAGE = "Error_Description : Error at Java Middleware required fields mid-settings->terminal_id can't be empty";
		public static final String VP_INVALID_TRANSACTIONTOKEN_ERROR = "PAYMENT ACCOUNT NOT FOUND";
		public static final String VP_INVALID_TX_TAG_ERROR = "The 'https://transaction.elementexpress.com:TransactionID' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:long' - The string 'invalid' is not a valid Int64 value.";
		public static final String VP_INVALID_REST_TRANSACTIONTOKEN_ERROR = "ERROR";
		public static final String VP_UNKNOWN_TX_TAG_ERROR = "TRANSACTION NOT FOUND";
		public static final String VP_TWICE_USED_TX_TAG_ERROR = "RETURN AMOUNT EXCEEDS ORIGINAL TRANSACTION AMOUNT";
		public static final String VP_DR_C_TWICEUSED_PREVPROCESSID_ERROR = "Invalid Transaction Status";
		public static final String VP_PFR_MIDUSERNAME_BLANK_ERROR_MESSAGE = "The 'https://reporting.elementexpress.com:AccountID' element is invalid - The value '' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string '' is not a valid Integer value.";
		public static final String VP_PFR_MIDKEY_BLANK_ERROR_MESSAGE = "Invalid Request";
		public static final String VP_PFR_APPLICATIONID_BLANK_ERROR_MESSAGE = "The 'https://reporting.elementexpress.com:ApplicationID' element is invalid - The value '' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string '' is not a valid Integer value.";
		public static final String VP_PFR_MERCHANTID_BLANK_ERROR_MESSAGE = "AcceptorID required";
		public static final String VP_PFR_MIDUSERNAME_INVALID_ERROR_MESSAGE = "The 'https://reporting.elementexpress.com:AccountID' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string 'invalid' is not a valid Integer value.";
		public static final String VP_PFR_APPLICATIONID_INVALID_ERROR_MESSAGE = "The 'https://reporting.elementexpress.com:ApplicationID' element is invalid - The value 'invalid' is invalid according to its datatype 'http://www.w3.org/2001/XMLSchema:integer' - The string 'invalid' is not a valid Integer value.";
		public static final String VP_INVALID_AMOUNT_ERROR_MESSAGE = "For input string: \"invalid\"";
		
		//Below fields are used for ChasePay API
		public static final String CP_INVALID_FIELD_MESSAGE = "SOAP-ENV:Server : 20412: Precondition Failed: Security Information is missing";
		public static final String CP_INVALID_FIELD_FAULTSTRING = "20412: Precondition Failed: Security Information is missing";
		public static final String CP_INVALID_FIELD_FAULTCODE = "SOAP-ENV:Server";
		public static final String CP_INVALID_TERMINALID_MESSAGE = "SOAP-ENV:Server : 523 An invalid TID was received";
		public static final String CP_INVALID_TERMINALID_FAULTSTRING = "523 An invalid TID was received";
		public static final String CP_OUTOFRANGE_TERMINALID_MESSAGE = "SOAP-ENV:Server : 833 Error validating terminal id [98565]. Must be 000-999.";
		public static final String CP_OUTOFRANGE_TERMINALID_FAULTSTRING = "833 Error validating terminal id [98565]. Must be 000-999.";
		public static final String CP_INVALID_BIN_MESSAGE = "SOAP-ENV:Server : 516 The Merchant ID 700000012102/Acquiring BIN ID 78547 is invalid or missing. Message rejected.";
		public static final String CP_INVALID_BIN_FAULTSTRING = "516 The Merchant ID 700000012102/Acquiring BIN ID 78547 is invalid or missing. Message rejected.";
		public static final String CP_OUTOFRANGE_BIN_MESSAGE = "SOAP-ENV:Server : 521 Error. The Orbital Gateway has received a badly formatted message. Field [BIN] exceeded max length of [6]";
		public static final String CP_OUTOFRANGE_BIN_FAULTSTRING = "521 Error. The Orbital Gateway has received a badly formatted message. Field [BIN] exceeded max length of [6]";
		public static final String CP_INVALID_AMOUNT_MESSAGE = "SOAP-ENV:Server : 801 Error validating amount. Must be numerical and greater than 0 [invalid]";
		public static final String CP_INVALID_AMOUNT = "Error_Description : Error at Java Middleware For input string: \"invalid\"";
		public static final String CP_INVALID_AMOUNT_FAULTSTRING = "801 Error validating amount. Must be numerical and greater than 0 [invalid]";
		public static final String CP_INVALID_TRANSACTIONTOKEN_MESSAGE = "SOAP-ENV:Server : 934 Expiry Date Can Not Be Empty.";
		public static final String CP_INVALID_TRANSACTIONTOKEN = "SOAP-ENV:Server : 841 Error validating card/account number range";
		public static final String CP_INVALID_TOKEN = "841 Error validating card/account number range";
		public static final String CP_INVALID_TRANSACTIONTOKEN_FAULTSTRING = "934 Expiry Date Can Not Be Empty.";
		public static final String CP_SOAP_ENV_ERROR = "SOAP-ENV:Server";
		public static final String CP_INVALID_INDUSTRYTYPE_MESSAGE = "SOAP-ENV:Server : 521 Error. The Orbital Gateway has received a badly formatted message. Invalid Industry Type: [invalid]: Must be: [EC|MO|RE|RC|IV|IN]";
		public static final String CP_INVALID_INDUSTRYTYPE_FAULTSTRING = "521 Error. The Orbital Gateway has received a badly formatted message. Invalid Industry Type: [invalid]: Must be: [EC|MO|RE|RC|IV|IN]";
//		public static final String CP_DR_INVALID_TERMINALID_MESSAGE = "SOAP-ENV:Server : 881 The LIDM you supplied (5A545764107A4C1174AEC49A2BFDD295904F5391) does not match with any existing transaction";
		public static final String CP_DR_INVALID_TERMINALID_MESSAGE = "SOAP-ENV:Server : 881 The LIDM you supplied (5BA0DE77C4752CA642E4400006056E62B2685309) does not match with any existing transaction";
		public static final String CP_R_INVALID_TERMINALID_MESSAGE = "SOAP-ENV:Server : 881 The LIDM you supplied (5BA20F467F7FCD9486F14FC4056A7B3EA1B3530A) does not match with any existing transaction";
//		public static final String CP_DR_INVALID_TERMINALID_FAULTSTRING = "881 The LIDM you supplied (5A545764107A4C1174AEC49A2BFDD295904F5391) does not match with any existing transaction";
		public static final String CP_DR_INVALID_TERMINALID_FAULTSTRING = "881 The LIDM you supplied (5BA0DE77C4752CA642E4400006056E62B2685309) does not match with any existing transaction";
		public static final String CP_R_INVALID_TERMINALID_FAULTSTRING = "881 The LIDM you supplied (5BA20F467F7FCD9486F14FC4056A7B3EA1B3530A) does not match with any existing transaction";		
		public static final String CP_INVALID_PREVPROCESSID_MESSAGE = "Error_Description : Error at Java Middleware 1";
		public static final String CP_UNKNOWN_PREVPROCESSID_MESSAGE = "SOAP-ENV:Server : 881 The LIDM you supplied (3F3F3F) does not match with any existing transaction";
		public static final String CP_UNKNOWN_PREVPROCESSID_FAULTSTRING = "881 The LIDM you supplied (3F3F3F) does not match with any existing transaction";
		public static final String CP_TWICEUSED_PREVPROCESSID_MESSAGE = "SOAP-ENV:Server : 882 This transaction is locked down. You cannot mark or unmark it.";
		public static final String CP_TWICEUSED_PREVPROCESSID_FAULTSTRING = "882 This transaction is locked down. You cannot mark or unmark it.";
		public static final String CP_RPP_INVALID_AMOUNT_MESSAGE = "SOAP-ENV:Server : 885 Error validating amount. Must be numeric, equal to zero or greater [invalid]";
		public static final String CP_RPP_INVALID_AMOUNT_FAULTSTRING = "885 Error validating amount. Must be numeric, equal to zero or greater [invalid]";
		public static final String CP_CAPTUREORDERID_REFUNDRESP_ERROR = "SOAP-ENV:Server : 9806 Refund Transactions By TxRefNum Are Only Valid When The Original Transaction Was An AUTH Or AUTH CAPTURE.";
		public static final String CP_CAPTUREORDERID_REFUNDRESP_FAULTSTRING = "9806 Refund Transactions By TxRefNum Are Only Valid When The Original Transaction Was An AUTH Or AUTH CAPTURE.";
		public static final String HOSTED_SECURE_ID_BLANK_ERROR = "required fields mid-settings->hosted_secure_id can't be empty";
		public static final String HOSTED_API_TOKEN_BLANK_ERROR = "required fields mid-settings->hosted_api_token can't be empty";
		public static final String FORM_FIELD_BLANK_ERROR = "form_fields struct can't be null";
		public static final String ORDERS_BLANK_ERROR = "orders struct can't be null";
}
