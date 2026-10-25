


    # userNumber = "4388576018402626"

    userInput = input("Please enter your credit card number")

    print(creditCard_Type_Checker(userInput))

    print(userInput)

    print("Credit Card Digit Length is: " + len(userInput))

    result = int(add_digitsIn_oddIndex(userInput)) + int(add_single_digit_numbers(usersInput))

    if result % 10 == 0:

        print("Credit Card Validity Status: valid")

    else:

        print("Credit Card Validity Status: invalid")








def add_single_digit_numbers(usersInput):

    integer_value_at_index = 0
    character_at_index = ""
    sum_of_twoDigit_number = 0
    sum_of_single_digit_value = 0
    sum_ofsingle_digit_numbers = 0

    for index in range(len(usersInput)- 2, -1, -2):

        integer_value_at_index = int(usersInput[index])

        character_at_index = str(integerValueOfIndex * 2)

        if len(character_at_index) - 1 > 0:

            sum_of_twoDigit_number += (int(character_at_index[0]) + int(character_at_index[1]))

        else:
            sum_of_single_digit_value += int(character_at_index[0])

    sum_ofsingle_digit_numbers = sum_of_single_digit_value + sum_of_twoDigit_number

    return str(sum_ofsingle_digit_numbers)


def add_digitsIn_oddIndex(usersInput):

    sum_of_odd_Index = 0

    for index in range(len(usersInput)):

        if index % 2 > 0:

            sum_of_odd_Index += int(usersInput[index])

    return str(sum_of_odd_Index)


def creditCard_Type_Checker(usersInput):

    card_type_remark = ""

    if usersInput[0] == '4':

        card_type_remark = "Credit Card Type: VisaCards"

    elif usersInput[0] == '5':

        card_type_remark = "Credit Card Type: MasterCard"

    elif usersInput[0] == '3' and usersInput[1] == '7':

        card_type_remark = "Credit Card Type: American Express Cards"

    else:
        card_type_remark = "Invalid Card"

    return card_type_remark



