<?php

class rightDTO{
    private $rightname;
    private $screenname;

    function __construct($rightname,$screenname){
        $this->rightname = $rightname;
        $this->screenname = $screenname;
    }

    public function setRightname($rightname){
        $this->rightname = $rightname;
    }
    
    public function getRightname(){
        return $this->rightname;
    }

    public function setScreenname($screenname){
        $this->screenname = $screenname;
    }
    
    public function getScreenname(){
        return $this->screenname;
    }

    // public function __toString()
    // {
    //   return "rightname $this->rightname  screenname $this->screenname";
    // }

}

?>