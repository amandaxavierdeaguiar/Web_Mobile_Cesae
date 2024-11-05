<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    //Para aceder em outros locais
    public function welcome(){
        $weekDays = $this->getAllWeekDays();
        return view('welcome', compact('weekDays'));
    }

    public function home(){
        $myFirstVar = 'hello Word';
        $weekDays = $this->getAllWeekDays();
        $info = $this->getCourseAll();
        $cesae = $this->getCesaeInfo();
        return view('utils.home', compact ('myFirstVar', 'weekDays', 'info', 'cesae'));
    }

    //Função acessória - private pois so vamos utilizar neste utilizador
    private function getAllWeekDays(){
        $weekDays = ['Segunda', 'Terça', 'Quarta'];
        return $weekDays;
    }

    private function getCourseAll(){
        $courseInfo = ['nome' => 'Web&Mobile', 'hours' => 950 ];
        return $courseInfo;
    }

    private function getCesaeInfo(){
        $cesaeInfo = ['name' => 'Cesae', 'address' => 'Rua Ciríaco Cardoso 186 4150-212 Porto', 'email' => 'cesae@cesae.pt' ];
        return $cesaeInfo;
    }
}
