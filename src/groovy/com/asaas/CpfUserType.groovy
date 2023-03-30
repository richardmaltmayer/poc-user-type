package com.asaas

import org.hibernate.HibernateException
import org.hibernate.usertype.UserType

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Types

class CpfUserType implements UserType {

    @Override
    int[] sqlTypes() {
        return [Types.VARCHAR] as int[]
    }

    @Override
    Class returnedClass() {
        return Cpf
    }

    @Override
    boolean equals(Object o, Object o1) throws HibernateException {
        return o.equals(o1)
    }

    @Override
    int hashCode(Object o) throws HibernateException {
        return o.hashCode()
    }

    @Override
    Object nullSafeGet(ResultSet resultSet, String[] strings, Object o) throws HibernateException, SQLException {
        String value = resultSet.getObject(strings[0]) != null ? resultSet.getObject(strings[0]) : null

        Cpf cpf = new Cpf()
        cpf.value = value

        return cpf
    }

    @Override
    void nullSafeSet(PreparedStatement preparedStatement, Object o, int i) throws HibernateException, SQLException {
        Cpf cpf = ((Cpf) o)

        if (cpf && cpf.value) {
            preparedStatement.setString(i, cpf.value)
        } else {
            preparedStatement.setNull(i, Types.VARCHAR)
        }
    }

    @Override
    Object deepCopy(Object o) throws HibernateException {
        return o
    }

    @Override
    boolean isMutable() {
        return false
    }

    @Override
    Serializable disassemble(Object o) throws HibernateException {
        return o
    }

    @Override
    Object assemble(Serializable serializable, Object o) throws HibernateException {
        return o
    }

    @Override
    Object replace(Object o, Object o1, Object o2) throws HibernateException {
        return o
    }
}