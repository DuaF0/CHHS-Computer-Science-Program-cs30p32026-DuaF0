
/*

Program: StudentSemAvg.java         

Purpose: allow a user to enter student grades, calculate their average, and save or display the results using a GUI with file handling.

Author: Dua Fatima, 
School: CHHS
Course: CSE2130

*/

package Mastery;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class StudentSemAvg 
{

    // Main window frame
    private JFrame frame;

    // Text fields for user input
    private JTextField studentname;
    private JTextField gradelevel;
    private JTextField semesternum;
    private JTextField grade1;
    private JTextField grade2;
    private JTextField grade3;
    private JTextField grade4;

    // Constant file name
    private static final String FILE_NAME = "Grades.txt";

    // File object used for reading/writing
    private File dataFile = new File(FILE_NAME);

    // Launch the application.
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    // Create object of program
                    StudentSemAvg window = new StudentSemAvg();

                    // Display the GUI window
                    window.frame.setVisible(true);
                } 
                
                catch (Exception e) 
                {
                    // Print error if program fails to start
                    e.printStackTrace();
                }
            }
        });
    }

    // Constructor - calls initialize method
    public StudentSemAvg() 
    {
        initialize();
    }

    //Builds and sets up the GUI
    private void initialize() 
    {

        // Formatter for displaying numbers (1 decimal place)
        DecimalFormat decimalFormatter = new DecimalFormat("0.#");

        NumberFormat.getPercentInstance();

        // Create main window
        frame = new JFrame();
        frame.setBounds(100, 100, 554, 624);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Create panel container
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 538, 574);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        // Labels for input
        JLabel lblNewLabel = new JLabel("Student Name:");
        lblNewLabel.setForeground(new Color(255, 131, 128));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 11, 142, 25);
        panel.add(lblNewLabel);

        JLabel lblGradeLevel = new JLabel("Grade Level:");
        lblGradeLevel.setForeground(new Color(255, 131, 128));
        lblGradeLevel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGradeLevel.setBounds(10, 43, 142, 25);
        panel.add(lblGradeLevel);

        JLabel lblSemesterNumber = new JLabel("Semester Number:");
        lblSemesterNumber.setForeground(new Color(255, 131, 128));
        lblSemesterNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblSemesterNumber.setBounds(10, 79, 142, 25);
        panel.add(lblSemesterNumber);

        // Grade labels
        JLabel lblGrade = new JLabel("Grade 1:");
        lblGrade.setForeground(new Color(255, 131, 128));
        lblGrade.setFont(new Font("Arial", Font.BOLD, 15));
        lblGrade.setBounds(10, 115, 142, 25);
        panel.add(lblGrade);

        JLabel lblGrade_5 = new JLabel("Grade 2:");
        lblGrade_5.setForeground(new Color(255, 131, 128));
        lblGrade_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGrade_5.setBounds(10, 151, 142, 25);
        panel.add(lblGrade_5);

        JLabel lblGrade_1 = new JLabel("Grade 3:");
        lblGrade_1.setForeground(new Color(255, 131, 128));
        lblGrade_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGrade_1.setBounds(10, 187, 142, 25);
        panel.add(lblGrade_1);

        JLabel lblGrade_2 = new JLabel("Grade 4:");
        lblGrade_2.setForeground(new Color(255, 131, 128));
        lblGrade_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGrade_2.setBounds(10, 223, 142, 25);
        panel.add(lblGrade_2);

        JLabel lblAverage = new JLabel("Average:");
        lblAverage.setForeground(new Color(255, 131, 128));
        lblAverage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblAverage.setBounds(10, 259, 82, 25);
        panel.add(lblAverage);

        // Input fields for user data
        studentname = new JTextField();
        studentname.setBounds(162, 13, 366, 25);
        panel.add(studentname);
        studentname.setColumns(10);

        gradelevel = new JTextField();
        gradelevel.setColumns(10);
        gradelevel.setBounds(162, 43, 366, 25);
        panel.add(gradelevel);

        semesternum = new JTextField();
        semesternum.setColumns(10);
        semesternum.setBounds(162, 79, 366, 25);
        panel.add(semesternum);

        grade1 = new JTextField();
        grade1.setColumns(10);
        grade1.setBounds(162, 115, 366, 25);
        panel.add(grade1);

        grade2 = new JTextField();
        grade2.setColumns(10);
        grade2.setBounds(162, 151, 366, 25);
        panel.add(grade2);

        grade3 = new JTextField();
        grade3.setColumns(10);
        grade3.setBounds(162, 187, 366, 25);
        panel.add(grade3);

        grade4 = new JTextField();
        grade4.setColumns(10);
        grade4.setBounds(162, 223, 366, 25);
        panel.add(grade4);

        // Label to display calculated average
        JLabel avg = new JLabel("");
        avg.setFont(new Font("Tahoma", Font.PLAIN, 15));
        avg.setBounds(90, 259, 64, 25);
        panel.add(avg);

        // Text area to display file contents
        JTextArea dis = new JTextArea();
        dis.setBackground(new Color(255, 232, 232));
        dis.setEditable(false);
        dis.setBounds(10, 289, 518, 240);
        panel.add(dis);

        //Save button 
        JButton savebtn = new JButton("Save To File");
        savebtn.setForeground(new Color(255, 255, 255));

        savebtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // Get user input and remove extra spaces
                String studentn = studentname.getText().trim();
                String grdlvl = gradelevel.getText().trim();
                String semnum = semesternum.getText().trim();
                String grd1 = grade1.getText().trim();
                String grd2 = grade2.getText().trim();
                String grd3 = grade3.getText().trim();
                String grd4 = grade4.getText().trim();

                // Check if any input field is empty
                if (studentn.isEmpty() || grdlvl.isEmpty() || semnum.isEmpty() || grd1.isEmpty() || grd2.isEmpty()|| grd3.isEmpty() || grd4.isEmpty())
                {
                    // Show warning message
                    JOptionPane.showMessageDialog(null,"1 or More Fields are Empty, Please enter a value","Input Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try
                {
                    // Convert grades to numbers and calculate average
                    double avgGrade = ((Double.parseDouble(grd1)) + (Double.parseDouble(grd2)) +(Double.parseDouble(grd3)) + (Double.parseDouble(grd4))) / 4;

                    // Display average in GUI
                    avg.setText(decimalFormatter.format(avgGrade) + "%");

                    // Prepare to write to file
                    StringBuilder output = new StringBuilder();
                    FileWriter out = new FileWriter(dataFile, true);
                    BufferedWriter writeFile = new BufferedWriter(out);

                    // Build output string
                    output.append("Name: ").append(studentn);
                    output.append(" Grade Level: ");
                    output.append(grdlvl).append(" Semester: ");
                    output.append(semnum);
                    output.append(" Grades: ");
                    output.append(decimalFormatter.format(Double.parseDouble(grd1))).append("%, ");
                    output.append(decimalFormatter.format(Double.parseDouble(grd2))).append("%, ");
                    output.append(decimalFormatter.format(Double.parseDouble(grd3))).append("%, ");
                    output.append(decimalFormatter.format(Double.parseDouble(grd4))).append("%, ");
                    output.append(" Average: ").append(decimalFormatter.format(avgGrade)).append("%");

                    // Write to file
                    writeFile.write(output.toString());
                    writeFile.newLine();

                    // Close file
                    writeFile.close();
                    out.close();

                    // Confirmation message
                    JOptionPane.showMessageDialog(null, "Data saved to file " + FILE_NAME,"Message", JOptionPane.INFORMATION_MESSAGE);

                    // Prompt user to display file
                    dis.setText("Press 'View File Content' to read data of file " + FILE_NAME);
                }

                // File writing error
                catch (IOException err)
                {
                    JOptionPane.showMessageDialog(null, "File could not be created\n" + err.getMessage(),"File Error", JOptionPane.ERROR_MESSAGE);
                }

                // Invalid number input error
                catch (NumberFormatException err)
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for grades","Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        savebtn.setBackground(new Color(255, 198, 198));
        savebtn.setBounds(126, 540, 131, 23);
        panel.add(savebtn);
        
        // Diplay buttin
        JButton showbtn = new JButton("View File Contents");
        showbtn.setForeground(new Color(255, 255, 255));

        showbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                // Clear text area before displaying
                dis.setText(null);

                try
                {
                    // Open file for reading
                    FileReader in = new FileReader(dataFile);
                    BufferedReader readFile = new BufferedReader(in);

                    String line;
                    StringBuilder output = new StringBuilder();

                    // Read file line by line
                    while ((line = readFile.readLine()) != null)
                    {
                        output.append(line).append("\n");
                    }

                    // Close file
                    readFile.close();
                    in.close();

                    // Display contents
                    dis.setText(output.toString());
                }

                // File not found error
                catch (FileNotFoundException err)
                {
                    JOptionPane.showMessageDialog(null, "File could not be found!\n" + err.getMessage(),"File Error", JOptionPane.ERROR_MESSAGE);
                }

                // File reading error
                catch (IOException err)
                {
                    JOptionPane.showMessageDialog(null,"Error reading file:\n" + err.getMessage(),"File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        showbtn.setBackground(new Color(255, 198, 198));
        showbtn.setBounds(277, 540, 152, 23);
        panel.add(showbtn);
    }
}