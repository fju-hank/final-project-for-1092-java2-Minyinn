package com.fju;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Source;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Window;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

public class Min_Post extends JFrame {

	private JPanel contentPane;
	private JTextField lengthTxt;
	private JTextField widthTxt;
	private JTextField heightTxt;
	JFrame frame;
	int[][] packageData;
	DefaultTableModel dtm = new DefaultTableModel();
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Min_Post window = new Min_Post();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Min_Post() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame("MIN'S POST");
		frame.setBounds(700, 300, 899, 390);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gbl_contentPane);

		JPanel bg_panel = new JPanel();
		GridBagConstraints gbc_bg_panel = new GridBagConstraints();
		gbc_bg_panel.fill = GridBagConstraints.BOTH;
		gbc_bg_panel.gridx = 0;
		gbc_bg_panel.gridy = 0;
		frame.getContentPane().add(bg_panel, gbc_bg_panel);
		GridBagLayout gbl_bg_panel = new GridBagLayout();
		gbl_bg_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 31, 37, 36, 0, 34, 44, 42, 0, 0 };
		gbl_bg_panel.rowHeights = new int[] { 39, 39, -13, 0, 0, 0, 25, 42, 0, 0, 0 };
		gbl_bg_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_bg_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		bg_panel.setLayout(gbl_bg_panel);

		JLabel lblNewLabel = new JLabel("MIN'S POST");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 0;
		bg_panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_8 = new JLabel("Record:");
		lblNewLabel_8.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(10, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 6;
		gbc_lblNewLabel_8.gridy = 1;
		bg_panel.add(lblNewLabel_8, gbc_lblNewLabel_8);

		JLabel lblNewLabel_1 = new JLabel("Please enter the size of  the package:");
		lblNewLabel_1.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.ipady = 1;
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(5, 10, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		bg_panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNewLabel_7 = new JLabel("Box1: $100   Box2: $150   Box3: $200   Box4: $300   Box5: $400");
		lblNewLabel_7.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_7.gridwidth = 5;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 10, 10);
		gbc_lblNewLabel_7.gridx = 8;
		gbc_lblNewLabel_7.gridy = 1;
		bg_panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		JLabel lblNewLabel_2 = new JLabel("Length:");
		lblNewLabel_2.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.ipady = 3;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		bg_panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		lengthTxt = new JTextField();
		GridBagConstraints gbc_lengthTxt = new GridBagConstraints();
		gbc_lengthTxt.gridwidth = 3;
		gbc_lengthTxt.insets = new Insets(0, 0, 5, 5);
		gbc_lengthTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_lengthTxt.gridx = 3;
		gbc_lengthTxt.gridy = 3;
		bg_panel.add(lengthTxt, gbc_lengthTxt);
		lengthTxt.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Width:");
		lblNewLabel_3.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.ipady = 3;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 4;
		bg_panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		widthTxt = new JTextField();
		GridBagConstraints gbc_widthTxt = new GridBagConstraints();
		gbc_widthTxt.gridwidth = 3;
		gbc_widthTxt.insets = new Insets(0, 0, 5, 5);
		gbc_widthTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_widthTxt.gridx = 3;
		gbc_widthTxt.gridy = 4;
		bg_panel.add(widthTxt, gbc_widthTxt);
		widthTxt.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 6;
		gbc_scrollPane.gridy = 2;
		bg_panel.add(scrollPane, gbc_scrollPane);

		table = new JTable();

		scrollPane.setViewportView(table);
		dtm.addColumn("Length");
		dtm.addColumn("Width");
		dtm.addColumn("Height");
		table.setModel(dtm);

		JLabel lblNewLabel_4 = new JLabel("Height:");
		lblNewLabel_4.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.ipady = 3;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 5;
		bg_panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		heightTxt = new JTextField();
		GridBagConstraints gbc_heightTxt = new GridBagConstraints();
		gbc_heightTxt.gridwidth = 3;
		gbc_heightTxt.insets = new Insets(0, 0, 5, 5);
		gbc_heightTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_heightTxt.gridx = 3;
		gbc_heightTxt.gridy = 5;
		bg_panel.add(heightTxt, gbc_heightTxt);
		heightTxt.setColumns(10);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					int inputLength = Integer.parseInt(lengthTxt.getText());
					int inputWidth = Integer.parseInt(widthTxt.getText());
					int inputHeight = Integer.parseInt(heightTxt.getText());
					if (inputLength > 0 && inputWidth > 0 && inputHeight > 0) {
						String[] testArray = { lengthTxt.getText(), widthTxt.getText(), heightTxt.getText() };
						dtm.addRow(testArray);
					} else {
						System.out.println("輸入小於0的數字");
						JOptionPane.showMessageDialog(null, "請確認輸入的資料為數字或是在正整數的範圍之內", "輸入資料錯誤",
								JOptionPane.WARNING_MESSAGE);
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "請確認輸入的資料為數字或是在正整數的範圍之內", "輸入資料錯誤",
							JOptionPane.WARNING_MESSAGE);
				}
				lengthTxt.setText("");
				widthTxt.setText("");
				heightTxt.setText("");
			}
		});
		btnNewButton.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 13));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(5, 5, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 6;
		bg_panel.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dtm.getRowCount() > 0) {
					for (int i = table.getRowCount() - 1; i > -1; i--) {
						dtm.removeRow(i);
					}
				}
				lengthTxt.setText("");
				widthTxt.setText("");
				heightTxt.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 10));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.insets = new Insets(5, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 10;
		gbc_btnNewButton_1.gridy = 7;
		bg_panel.add(btnNewButton_1, gbc_btnNewButton_1);

		JLabel lblNewLabel_5 = new JLabel("Box Size::");
		lblNewLabel_5.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 2;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 12;
		gbc_lblNewLabel_5.gridy = 7;
		bg_panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		JLabel boxSizeLb = new JLabel(" ");
		GridBagConstraints gbc_boxSizeLb = new GridBagConstraints();
		gbc_boxSizeLb.insets = new Insets(0, 0, 5, 10);
		gbc_boxSizeLb.gridx = 13;
		gbc_boxSizeLb.gridy = 7;
		bg_panel.add(boxSizeLb, gbc_boxSizeLb);

		JLabel lblNewLabel_6 = new JLabel("Price:");
		lblNewLabel_6.setFont(new Font("Adobe 繁黑體 Std B", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 12;
		gbc_lblNewLabel_6.gridy = 8;
		bg_panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		JLabel priceLb = new JLabel(" ");
		GridBagConstraints gbc_priceLb = new GridBagConstraints();
		gbc_priceLb.insets = new Insets(0, 0, 5, 10);
		gbc_priceLb.gridx = 13;
		gbc_priceLb.gridy = 8;
		bg_panel.add(priceLb, gbc_priceLb);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int[] rows = table.getSelectedRows();
				/* 點選的Table index */
				Object obj1 = table.getValueAt(rows[0], 0);
				String c1 = String.valueOf(obj1);
				Object obj2 = table.getValueAt(rows[0], 1);
				String c2 = String.valueOf(obj2);
				Object obj3 = table.getValueAt(rows[0], 2);
				String c3 = String.valueOf(obj3);
				lengthTxt.setText(c1);
				widthTxt.setText(c2);
				heightTxt.setText(c3);
				int c1Num = Integer.parseInt(c1);
				int c2Num = Integer.parseInt(c2);
				int c3Num = Integer.parseInt(c3);
				ArrayList<Integer> compareList = new ArrayList<Integer>();
				compareList.add(c1Num);
				compareList.add(c2Num);
				compareList.add(c3Num);
				Collections.sort(compareList);
				/* 設定5種箱子預設尺寸 */ /* Box1~5 */
				int[][] box = { { 10, 20, 25 }, { 20, 40, 40 }, { 35, 40, 60 }, { 45, 50, 70 }, { 30, 90, 100 } };
				ArrayList<Integer> getBoxNumArrayList = new ArrayList<Integer>();
				/* 判斷輸入的箱子是否在箱子範圍內 */
				if ((compareList.get(0) > 0 && compareList.get(0) <= 45)
						&& (compareList.get(1) > 0 && compareList.get(1) <= 90)
						&& (compareList.get(2) > 0 && compareList.get(2) <= 100)) {
					/* 從小到大依序比較裝得下的箱子 */
					for (int i = 0; i < 5; i++) {
						if ((compareList.get(0) <= box[i][0]) && (compareList.get(1) <= box[i][1])
								&& (compareList.get(2) <= box[i][2])) {
							/* 存入所有裝得下的箱子 */
							getBoxNumArrayList.add(i);
						} else {
						}
					}
					/* 從裝得下箱子中選最小的作為最適箱子 */
					boxSizeLb.setText("Box" + String.valueOf(getBoxNumArrayList.get(0) + 1));
					int[] boxPrice = { 100, 150, 200, 300, 400 };
					String priceStr = String.valueOf(boxPrice[getBoxNumArrayList.get(0)]);
					priceLb.setText(priceStr);
					compareList.clear();
				} else {
					System.out.println("Out of bound!!!");
					JOptionPane.showMessageDialog(null, "請確認輸入的資料為數字或是在正整數的範圍之內", "輸入資料錯誤",
							JOptionPane.WARNING_MESSAGE);
					boxSizeLb.setText(" ");
					priceLb.setText(" ");
				}

			}

		});

	}

}
