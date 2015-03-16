mport javax.swing.JOptionPane;
public class Assignment3 {

	public static void main(String[] args) {
			String Username = "Nabil"; String Password = "password"; String Usernametest = ""; 
					String Passwordtest =""; int i=0;
							Usernametest=JOptionPane.showInputDialog("What is the username?");
							while (!Usernametest.equals(Username)){//If the user puts the wrong username
								Usernametest=JOptionPane.showInputDialog("Please try again. Enter the username."); // Prompted to try again
									i++;// counts attempts
										if (i==3){ // If they try too many times
												JOptionPane.showMessageDialog(null,"Invalid Username."); // then it will display invaild username
														JOptionPane.showMessageDialog(null, "Contact the administrator."); // and to contact the administrator
																System.exit(0);} // the program will end
																}
																Passwordtest=JOptionPane.showInputDialog("Enter the password."); //user has a chance to type in password
																while (!Password.equals(Passwordtest)){ // If it's wrong the user will have to try again.
																	Passwordtest=JOptionPane.showInputDialog("That is inccorect. Enter the password again.");
																		i++;
																			if (i==3){ // if they tried too many times 
																					JOptionPane.showMessageDialog(null, "You tried too many times."); // this will output
																							System.exit(0);} // and the program will end
																							}
																							String[] choices = { "Admin", "Student", "Staff"}; // choices for drop down menu written as an array
																							String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account types",JOptionPane.QUESTION_MESSAGE, null,choices,choices[2]);
																							while (!input.equals("Student")){ // Loop to keep the user choosing until he choses the right account type (student)
																							switch(input){ // based on the decision there will be two options.
																							case "Admin": // If the user chooses admin the following will happen
																								JOptionPane.showMessageDialog(null, "That is the wrong type please try again for your username."); // tells the user he is wrong.
																									input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account types",JOptionPane.QUESTION_MESSAGE, null,choices,choices[2]);//User trys again
																									case "Staff": // If the user chooses Staff the following will happen
																										JOptionPane.showMessageDialog(null, "That is the wrong type please try again for your username.");
																											input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account types",JOptionPane.QUESTION_MESSAGE, null,choices,choices[2]);

																											} 
																											}
																											JOptionPane.showMessageDialog(null, "Welcome student! You can only read files."); // If the user chooses student it will prompt its right and end program.
																											}
																											}
