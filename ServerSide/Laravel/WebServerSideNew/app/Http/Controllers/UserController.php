<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Response;

class UserController extends Controller
{
    public function users(){
        return view('users.new_users');
    }

    public function usersAll(){
        // chamando a guncao
        //$users = $this->getAllUsersFromDB();

        // Ta buscando do modelo
        // importar do modelo
        $users = User::all();
        // $user= User::getUsersByMonth($month)
        // Utilizar scopo (documentacao)

        //dd(User::TYPE_ADMIN);
        //dd($users);
        //Para testar
        //dd($users[1]);
        return view('users.all_users', compact('users'));
    }
    //return view('users.all_users');

    private function getUserFromArray(){
        $users = [
            ['id' => 1, 'name' => 'John', 'email' => 'jhons@gmail.com'],
            ['id' => 2, 'name' => 'Amanda', 'email' => 'amanda@gmail.com'],
            ['id' => 3, 'name' => 'Bianca', 'email' => 'bianca@gmail.com'],
        ];
        return $users;
    }

    public function insertUser(){
        //Insert na BD
        // DB::table('users')->insert([
        //     'name' => 'Aurelio',
        //     'email' => 'aurelio@gmail.com',
        //     'password' => 'Aurelio123'
        // ]);

        // Update da BD
        // DB::table('users')
        // ->where('id', 7)
        // ->update(
        //     ['name' => 'Aurélio José']
        // );

        // Primeiro Valida e depois Coloca na BD
        // Primeiro vai procurar na BD
        // DB::table('users')
        // ->updateOrInsert(
        //     [
        //         'email' => 'ray@gmail.com',
        //         'password' => 'Rayanne123456'
        //     ],
        //     // Atualiza ou cria se nao existe
        //     [
        //         'name' => 'Rayanne',
        //         'updated_at' => now(),
        //         'nif' => '123456'
        //     ]
        // );

        DB::table('users')
        ->where('id', 8)
        ->delete();

        // Para testar, tem que importar Illuminate\Support\Facades\Response;
        return Response::json('sucesso');
    }

    public function viewUser($id){

        $user = User::where('id', $id)->first();
        // dd($user);

        return view('users.show_user', compact('user'));
    }

    private function getAllUsersFromDB(){
        $users = Db::table('users')
        ->whereNotNull('email') // Onde não é nulo o email
        ->get();

        //dd($users);

        return $users;
    }
}
