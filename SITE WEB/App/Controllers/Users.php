<?php

namespace App\Controllers;

use App\Models\User;
use \Core\View;

/**
 * Posts controller
 */
class Users extends \Core\Controller
{

    /**
     * Show the index page
     *
     * @return void
     */
    public function indexAction()
    {
        $users = User::getAll();

        View::renderTemplate('Users/index.html', ['routes' => $this->route_params, 'users'=> $users]);

    } /**
 * Show a post page
 *
 * @return void
 */


    /**
     * Show the add new page
     *
     * @return void
     */
    public function newAction()
    {
        View::renderTemplate('Users/register.html');
    }

    /**
     *add new user
     *
     * @return void
     */
    public function createAction()
    {
        $user = new User($_POST);

        $user->save();
        $this->indexAction();
    }

    /**
     * Show the edit page
     *
     * @return void
     */
    public function editAction()
    {
        echo 'Hello from the edit action in the Posts controller!';
        echo '<p>Route parameters: <pre>' .
            htmlspecialchars(print_r($this->route_params, true)) . '</pre></p>';
    }
}
