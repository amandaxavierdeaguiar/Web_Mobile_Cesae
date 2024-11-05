<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function allTasks(){
        $tasks = $this->getAllTasks();
        //dd($tasks);

        return view('tasks.all_tasks', compact('tasks'));
    }

    /* Importar a DB e colocar no return view */

    protected function getAllTasks(){
        $tasks = DB::table('tasks')
        //Dizer o que quer buscar
        ->join('users', 'users.id', '=', 'tasks.user_id')
        //fazer um select para dizer o que vai buscar. mudar o nome da tabela nome da users para facilitar o entendimento, colocamos como username
        ->select('tasks.*', 'users.name as username')
        ->get();
        return $tasks;
    }
}
