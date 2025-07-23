package equalmethod;

import com.sun.jdi.VMOutOfMemoryException;

public  class Voting{
    String name;
    int Votingnum;
    String Phone;

    public Voting(String name,int Votingnum,String Phone){
        this.name=name;
        this.Votingnum=Votingnum;
        this.Phone=Phone;
    }

    public boolean equals(Object vote) {
        Voting vote_1;
        if (vote instanceof Voting) {
            vote_1 = (Voting) vote;
            return this==vote_1;
        }
        else {
            return false;
        }

    }
}



