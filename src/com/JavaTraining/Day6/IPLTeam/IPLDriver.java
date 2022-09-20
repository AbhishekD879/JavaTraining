package com.JavaTraining.Day6.IPLTeam;

public class IPLDriver {
    public static void main(String[] args) {
        IPLTeam ipl = new IPLTeam();

        IPLTeam csk=new CSK();
        IPLTeam mi=new MI();
        IPLTeam srh=new SRH();
        ipl.tournamentWonBy();
        csk.tournamentWonBy();
        mi.tournamentWonBy();
        srh.tournamentWonBy();
    }
}
