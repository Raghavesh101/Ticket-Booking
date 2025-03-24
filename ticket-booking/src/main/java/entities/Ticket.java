package entities;

import java.util.Date;

public class Ticket {
    private String TicketId;
    private String UserId;
    private String source;
    private String destination;
    private String dateofTravel;
    private Train train;
    public Ticket(){}

    public Ticket(String ticketId, String userId, String source, String destination, String dateOfTravel, Train train){
        this.TicketId = ticketId;
        this.UserId = userId;
        this.source = source;
        this.destination = destination;
        this.dateofTravel = dateOfTravel;
        this.train = train;
    }

    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", TicketId, UserId, source, destination, dateofTravel);
    }

    public String getTicketId(){
        return TicketId;
    }

    public void setTicketId(String ticketId){
        this.TicketId = ticketId;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getUserId(){
        return UserId;
    }

    public void setUserId(String userId){
        this.UserId = userId;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDateOfTravel(){
        return dateofTravel;
    }

    public void setDateOfTravel(String dateOfTravel){
        this.dateofTravel = dateOfTravel;
    }

    public Train getTrain(){
        return train;
    }

    public void setTrain(Train train){
        this.train = train;
    }
}
