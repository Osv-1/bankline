package com.br.bankline.ui.statement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.bankline.databinding.ActivityBankStatementBinding
import com.br.bankline.domain.Correntista
import java.lang.IllegalArgumentException

class BankStatementActivity : AppCompatActivity() {


    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "com.br.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}