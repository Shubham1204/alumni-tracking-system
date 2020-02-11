<?php

include "rightDTO.php";

class userDTO{
    private $userid;
    private $email;
    private $rolename;
    // private $rights = new array($rightDTO);

    function __construct(){}

    function __construct3($userid, $email,$rolename){
        $this->userid=$userid;
        $this->email=$email;
        $this->rolename = $rolename;

    }

    public function setUserid($userid){
        $this->userid = $userid;
    }
    
    public function getUserid(){
        return $this->userid;
    }

    public function setEmail($email){
        $this->email = $email;
    }
    
    public function getEmail(){
        return $this->email;
    }
    
    public function setRolename($rolename){
        $this->rolename = $rolename;
    }
    
    public function getRolename(){
        return $this->rolename;
    }

    // public function setRights($rights){
    //     $this->rights = $rights;
    // }
    
    // public function getRights(){
    //     return $this->rights;
    // }

}

?>