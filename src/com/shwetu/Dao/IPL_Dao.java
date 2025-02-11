package com.shwetu.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

import com.shwetu.entity.Player;
import com.shwetu.utility.IPLUtility;

public class IPL_Dao {
	

		// this method add new player data into our databse table
		public String addPlayerData(int jerseyno, String pname, int runs, int wickets, String team) {
			String declaration = null;
			String addQuery = "INSERT INTO players(jn,name,runs,wickets,tname)VALUES (?,?,?,?,?)";
			try {
				Connection conn = IPLUtility.getConnection();
				PreparedStatement st = conn.prepareStatement(addQuery);

				// SET values
				st.setInt(1, jerseyno);
				st.setString(2, pname);
				st.setInt(3, runs);
				st.setInt(4, wickets);
				st.setString(5, team);

				int rowsAffected = st.executeUpdate();

				if (rowsAffected > 0) {
					declaration = "player added successfully....";

				} else {
					declaration = "player not added";
				}

			} catch (Exception e) {
				e.printStackTrace();

			}

			return declaration;
		}

		// this method update the existing player data.
		public String updatePlayerInfo(String oldname, String newname, int newruns, int newwickets, String newtname) {

			String updatequery = "UPDATE players SET name=?,runs=?,wickets=?,tname=? WHERE name=? ";
			String result = null;
			try {
				Connection conn = IPLUtility.getConnection();
				PreparedStatement st = conn.prepareStatement(updatequery);

				st.setString(1, newname);
				st.setInt(2, newruns);
				st.setInt(3, newwickets);
				st.setString(4, newtname);
				st.setString(5, oldname);

				int rowsAffected = st.executeUpdate();

				if (rowsAffected > 0) {
					result = "player updated successfully...";

				} else {
					result = "something went wrong";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return result;
		}

		/*
		 * delete player form the database this method delete the existing player
		 * information that are already present in our database
		 */
		public String deletePlayerData(String pname) {
			String p = pname;
			String result = null;
			String deleteQuery = "DELETE FROM players WHERE name=?";

			try {
				Connection conn = IPLUtility.getConnection();
				PreparedStatement st = conn.prepareStatement(deleteQuery);
				st.setString(1, p);
				int rowsAffected = st.executeUpdate();

				// Check if any row is deleted
				if (rowsAffected > 0) {
					result = "player deleted successfully.....";

				} else {

					result = "player not found";
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

			return result;

		}

		// this method read all data form the table and return that
		public List<Player> getAllPlayerData() {
			List<Player> allplayerdata = new ArrayList<Player>();
			String qur = "select * from players";

			try {
//			
				Connection conn = IPLUtility.getConnection();
				PreparedStatement st = conn.prepareStatement(qur);
				ResultSet res = st.executeQuery();
				while (res.next()) {

					int jurcy = res.getInt("jn");
					String pname = res.getString("name");
					int pruns = res.getInt("runs");
					int pwickets = res.getInt("wickets");
					String pteam = res.getString("tname");

					// System.out.println(jurcy);

					Player p = new Player(jurcy, pname, pruns, pwickets, pteam);
					allplayerdata.add(p);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return allplayerdata;
		}

}
			
		
