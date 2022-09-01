<?php

namespace App\Models;

use PDO;

/**
 * user model
 */
class User extends \Core\Model
{

  /**
   * Class constructor
   *
   * @param array $data  Initial property values
   *
   * @return void
   */
  public function __construct($data)
  {
    foreach ($data as $key => $value) {
      $this->$key = $value;
    };
  }

    /**
     * Get all the posts as an associative array
     *
     * @return array
     */
    public static function getAll()
    {


        try {
            $db = static::getDB();

            $stmt = $db->query('SELECT * FROM users');

            return $stmt->fetchAll(PDO::FETCH_ASSOC);

        } catch (PDOException $e) {
            echo $e->getMessage();
        }
    }

  /**
   * Save the user model with the current property values
   *
   * @return void
   */
  public function save()
  {
    $password_hash = password_hash($this->password, PASSWORD_DEFAULT);

    $sql = 'INSERT INTO users (firstName, lastName, email, password)
            VALUES (:firstName,:lastName, :email, :password)';

    $db = static::getDB();
    $stmt = $db->prepare($sql);

      $stmt->bindValue(':firstName', $this->firstName, PDO::PARAM_STR);
      $stmt->bindValue(':lastName', $this->lastName, PDO::PARAM_STR);
      $stmt->bindValue(':email', $this->email, PDO::PARAM_STR);
      $stmt->bindValue(':password', $password_hash, PDO::PARAM_STR);

    $stmt->execute();
  }
}
